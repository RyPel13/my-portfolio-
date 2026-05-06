package com.example.backend;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * Represents a personal or professional goal of the developer.
 */
@Entity
public class Goal {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    private String title;
    private String summary;
    private String timeline;
    private boolean achieved;
    
    @JsonBackReference("developer-goals")
    @ManyToOne
    @JoinColumn(name = "developer_id")
    private Developer developer;

    // default constructor required by Jackson
    public Goal() {}

    // defined constructor
    public Goal(String title, String summary, String timeline, boolean achieved) {
        this.title = title;
        this.summary = summary;
        this.timeline = timeline;
        this.achieved = achieved;
    }

    // getters
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getSummary() { return summary; }
    public String getTimeline() { return timeline; }
    public boolean isAchieved() { return achieved; }
    public Developer getDeveloper() { return developer; } 

    // setters
    public void setTitle(String title) { this.title = title; }
    public void setSummary(String summary) { this.summary = summary; }
    public void setTimeline(String timeline) { this.timeline = timeline; }
    public void setAchieved(boolean achieved) { this.achieved = achieved; }
    public void setDeveloper(Developer developer) { this.developer = developer; }
}
