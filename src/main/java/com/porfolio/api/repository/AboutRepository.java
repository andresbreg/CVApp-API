package com.porfolio.api.repository;

import com.porfolio.api.model.About;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutRepository extends JpaRepository <About, Integer> {
}