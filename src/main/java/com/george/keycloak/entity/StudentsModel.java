package com.george.keycloak.entity;

import jakarta.persistence.Id;
import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class StudentsModel {

    private UUID studentId;

    private String name;

    private String gender;

    private Integer age;
}
