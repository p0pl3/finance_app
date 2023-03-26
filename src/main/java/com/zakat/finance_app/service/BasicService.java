package com.zakat.finance_app.service;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class BasicService<T, ID> {
    protected final JpaRepository<T, ID> repository;

    protected BasicService(JpaRepository<T, ID> repository) {
        this.repository = repository;
    }

    public List<T> findAll() {
        return repository.findAll();
    }

    public Optional<T> findById(ID entityId) {
        return repository.findById(entityId);
    }

    public T save(T entity) {
        return repository.save(entity);
    }

    public void delete(T entity) {
        repository.delete(entity);
    }

    public void deleteById(ID entityId) {
        Optional<T> entity = repository.findById(entityId);
        entity.ifPresent(this::delete);
    }
}
