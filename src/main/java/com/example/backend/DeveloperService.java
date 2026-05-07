// DeveloperService.java
package com.example.backend;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DeveloperService {

    private final DeveloperRepository developerRepository;
    private final ProjectRepository projectRepository;
    private final GoalRepository goalRepository;
    private final InterestRepository interestRepository;

    public DeveloperService(DeveloperRepository developerRepository,
                            ProjectRepository projectRepository,
                            GoalRepository goalRepository,
                            InterestRepository interestRepository) {
        this.developerRepository = developerRepository;
        this.projectRepository = projectRepository;
        this.goalRepository = goalRepository;
        this.interestRepository = interestRepository;
    }

    // Developer
    public Developer getDeveloper(Long id) {
        return developerRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Developer not found"));
    }

    public Developer saveDeveloper(Developer developer) {
        return developerRepository.save(developer);
    }
    public boolean developerExists(Long id) {
        return developerRepository.existsById(id);
    }

    // Projects
    public List<Project> getProjectsByDeveloper(Long developerId) {
        return projectRepository.findByDeveloperId(developerId);
    }
    public List<Project> getProjectsByLanguage(String language) {
        return projectRepository.findByLanguage(language);
    }

    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }

    // Goals
    public List<Goal> getGoalsByDeveloper(Long developerId) {
        return goalRepository.findByDeveloperId(developerId);
    }

    public List<Goal> getAchievedGoals(Long developerId) {
        return goalRepository.findByDeveloperIdAndAchieved(developerId, true);
    }
    public List<Goal> getPendingGoals(Long developerId) {
        return goalRepository.findByDeveloperIdAndAchieved(developerId, false);
    }

    public Goal saveGoal(Goal goal) {
        return goalRepository.save(goal);
    }

    // Interests
    public List<Interest> getAllInterests() {
        return interestRepository.findAll();
    }

    public Interest saveInterest(Interest interest) {
        return interestRepository.save(interest);
    }
}
