package com.example.backend;

import jakarta.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * Represents the developer behind the portfolio.
 * Connect to Controller
 * Controller  →  DeveloperService  →  DeveloperRepository  →  Database
 */
@Entity
public class Developer implements Person {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    private String name;
    private String email;
    private String linkedIn;
    private String gitHub;
    private String introduction;
    
    @JsonManagedReference("developer-projects")
    @OneToMany(mappedBy = "developer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Project> projects;
    
    @JsonManagedReference("developer-interests")
    @ManyToMany
    @JoinTable(
        name = "developer_interests",
        joinColumns = @JoinColumn(name = "developer_id"),
        inverseJoinColumns = @JoinColumn(name = "interest_id")
    )
    private List<Interest> interests;
    
    @JsonManagedReference("developer-goals")
    @OneToMany(mappedBy = "developer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Goal> goals;

    // default constructor required by Jackson
    public Developer() {}

    // defined constructor
    public Developer(String name, String email, String linkedIn, String gitHub, String introduction,
                     List<Project> projects, List<Interest> interests, List<Goal> goals) {
        this.name = name;
        this.email = email;
        this.linkedIn = linkedIn;
        this.gitHub = gitHub;
        this.introduction = introduction;
        this.projects = projects;
        this.interests = interests;
        this.goals = goals;
    }

    // getters
    @Override
    public String getName() { return name; }

    @Override
    public String getEmail() { return email; }

    @Override
    public String getLinkedIn() { return linkedIn; }

    @Override
    public String getGitHub() { return gitHub; }

    @Override
    public String getIntroduction() { return introduction; }

    public List<Project> getProjects() { return projects; }
    public List<Interest> getInterests() { return interests; }
    public List<Goal> getGoals() { return goals; }
    

    // setters
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setLinkedIn(String linkedIn) { this.linkedIn = linkedIn; }
    public void setGitHub(String gitHub) { this.gitHub = gitHub; }
    public void setIntroduction(String introduction) { this.introduction = introduction; }
    public void setProjects(List<Project> projects) { this.projects = projects; }
    public void setInterests(List<Interest> interests) { this.interests = interests; }
    public void setGoals(List<Goal> goals) { this.goals = goals; }
}
