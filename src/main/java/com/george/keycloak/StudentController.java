package com.george.keycloak;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    @GetMapping("/getStudents")
    @PreAuthorize("hasRole('client_admin')")
    public String getStudents(){
        return "Hello from students";
    }

    @GetMapping("/getStudent")
//    @PreAuthorize("hasRole('client_user')")
    public String getStudent(){
        return "Hello from student";
    }

}
