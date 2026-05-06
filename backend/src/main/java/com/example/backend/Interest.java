package com.example.backend;

import jakarta.persistence.*;
import java.util.List;


/**
 * Represents a personal interest of the developer.
 */
@Entity
public class Interest {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    private String title;
    private String summary;
    private String category;
    
    @ManyToMany(mappedBy = "interests")
    private List<Developer> developers;

    // default constructor required by Jackson
    public Interest() {}

    // defined constructor
    public Interest(String title, String summary, String category) {
        this.title = title;
        this.summary = summary;
        this.category = category;
    }

    // getters
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getSummary() { return summary; }
    public String getCategory() { return category; }
    public List<Developer> getDevelopers() { return developers; }
    

    // setters
    public void setTitle(String title) { this.title = title; }
    public void setSummary(String summary) { this.summary = summary; }
    public void setCategory(String category) { this.category = category; }
    public void setDevelopers(List<Developer> developers) { this.developers = developers; }
}