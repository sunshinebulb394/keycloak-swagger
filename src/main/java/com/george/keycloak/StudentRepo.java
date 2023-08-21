package com.george.keycloak;

import com.george.keycloak.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StudentRepo extends JpaRepository<Students,UUID> {
}
