package com.example.iruda.projects;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    List<Project> findByUserId(Long userId);
}
