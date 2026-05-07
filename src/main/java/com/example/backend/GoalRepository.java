// GoalRepository.java
package com.example.backend;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface GoalRepository extends JpaRepository<Goal, Long> {
    List<Goal> findByDeveloperId(Long developerId);
    List<Goal> findByDeveloperIdAndAchieved(Long developerId, boolean achieved);
}
