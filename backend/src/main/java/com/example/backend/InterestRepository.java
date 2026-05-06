// InterestRepository.java
package com.example.backend;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface InterestRepository extends JpaRepository<Interest, Long> {
    List<Interest> findByCategory(String category);
}
