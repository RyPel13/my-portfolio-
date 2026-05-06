package com.example.backend;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class PortfolioController {

    private final DeveloperService developerService;

    public PortfolioController(DeveloperService developerService) {
        this.developerService = developerService;
    }

    // GET /person — returns full developer profile
    @GetMapping("/person")
    public ResponseEntity<Developer> getPerson() {
        Developer dev = developerService.getDeveloper(1L);
        return ResponseEntity.ok(dev);
    }

    // GET /projects — all projects
    // GET /projects?language=Java — filtered by language
    @GetMapping("/projects")
    public ResponseEntity<List<Project>> getProjects(
            @RequestParam(required = false) String language) {
        List<Project> projects = language != null
                ? developerService.getProjectsByLanguage(language)
                : developerService.getProjectsByDeveloper(1L);
        return ResponseEntity.ok(projects);
    }

    // GET /projects/{id} — single project by id
    @GetMapping("/projects/{id}")
    public ResponseEntity<Project> getProjectById(@PathVariable Long id) {
        List<Project> projects = developerService.getProjectsByDeveloper(1L);
        return projects.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // GET /interests — returns all interests
    @GetMapping("/interests")
    public ResponseEntity<List<Interest>> getInterests() {
        List<Interest> interests = developerService.getAllInterests();
        return ResponseEntity.ok(interests);
    }

    // GET /goals — returns all goals
    @GetMapping("/goals")
    public ResponseEntity<List<Goal>> getGoals() {
        List<Goal> goals = developerService.getGoalsByDeveloper(1L);
        return ResponseEntity.ok(goals);
    }

    // GET /goals/achieved — returns only completed goals
    @GetMapping("/goals/achieved")
    public ResponseEntity<List<Goal>> getAchievedGoals() {
        List<Goal> goals = developerService.getAchievedGoals(1L);
        return ResponseEntity.ok(goals);
    }

    // GET /goals/pending — returns only incomplete goals
    @GetMapping("/goals/pending")
    public ResponseEntity<List<Goal>> getPendingGoals() {
        List<Goal> goals = developerService.getPendingGoals(1L);
        return ResponseEntity.ok(goals);
    }
}