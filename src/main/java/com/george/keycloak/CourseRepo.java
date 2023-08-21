package com.george.keycloak;

import com.george.keycloak.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CourseRepo extends JpaRepository<Courses, UUID> {
}
