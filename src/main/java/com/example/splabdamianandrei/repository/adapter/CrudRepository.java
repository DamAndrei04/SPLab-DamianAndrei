package com.example.splabdamianandrei.repository.adapter;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<T, Id>{
    T save(T entity);

    Optional<T> findById(Id Id);

    List<T> findAll();

    void deleteById(Id id);

    boolean existsById(Id id);
    
}
