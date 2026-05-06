package com.example.backend;

import jakarta.persistence.*;

/**
 * Represents a project in the developer's portfolio.
 */
@Entity
public class Project {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    private String title;
    private String description;
    private String githubLink;
    private String language;
    private String category;
    
    @ManyToOne
    @JoinColumn(name = "developer_id")
    private Developer developer;

    // default constructor required by Jackson
    public Project() {}

    // defined constructor
    public Project(String title, String description,
                   String githubLink, String language,
                   String category) {
        this.title = title;
        this.description = description;
        this.githubLink = githubLink;
        this.language = language;
        this.category = category;
    }

    // getters
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getGithubLink() { return githubLink; }
    public String getLanguage() { return language; }
    public String getCategory() { return category; }
    public Developer getDeveloper() { return developer; }

    // setters
    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    public void setGithubLink(String githubLink) { this.githubLink = githubLink; }
    public void setLanguage(String language) { this.language = language; }
    public void setCategory(String category) { this.category = category; }
    public void setDeveloper(Developer developer) { this.developer = developer; }
}