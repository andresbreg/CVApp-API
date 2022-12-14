package com.porfolio.api.repository;

import com.porfolio.api.model.Projects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectsRepository extends JpaRepository <Projects, Integer> {
    
}
