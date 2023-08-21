package com.george.keycloak;

import java.util.List;
import java.util.Optional;

public interface DAO <T>{
    void create(T t);
    Optional<T> getById(Integer id);

    List<T> getAll();

    void delete(Integer id);

    T update(T t);
}
