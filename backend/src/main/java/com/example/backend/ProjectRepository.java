// ProjectRepository.java
package com.example.backend;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    List<Project> findByDeveloperId(Long developerId);
    List<Project> findByLanguage(String language);
    List<Project> findByCategory(String category);
}