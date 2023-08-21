package com.george.keycloak;


import com.george.keycloak.entity.StudentsModel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
@RequiredArgsConstructor
@Slf4j
public class StudentDao implements DAO<StudentsModel>{

    private final JdbcTemplate jdbcTemplate;

    RowMapper<StudentsModel> rowMapper  = (rs,rowNum) -> {
        return StudentsModel.builder()
                .studentId(UUID.fromString(rs.getString("studentId")))
                .name(rs.getString("name"))
                .gender(rs.getString("gender"))
                .age(rs.getInt("age"))
                .build();
    };

    @Override
    public void create(StudentsModel students) {
    try {
        String sql = "INSERT INTO students(student_id,name,gender,age) VALUES(?,?,?,?)";
        int rows = jdbcTemplate.update(sql,students.getStudentId(),students.getName(),students.getGender(),students.getAge());
        if (rows == 1) {
            log.info("Student Created");
        } else {
            log.info("Student not Created");
        }
    }catch (DataAccessException e){
        log.error(e.getMessage());
    }
    catch (Exception e){
        log.error("500 Internal Server Error");
    }

    }

    @Override
    public Optional<StudentsModel> getById(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<StudentsModel> getAll() {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public StudentsModel update(StudentsModel students) {
        return null;
    }
}
