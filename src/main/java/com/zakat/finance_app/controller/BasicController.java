package com.zakat.finance_app.controller;

import com.zakat.finance_app.service.BasicService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>Basic Controller that provides CRUD operations</p>
 *
 * @param <T>  Entity
 * @param <ID> Type of Entity ID
 */
public abstract class BasicController<T, ID> {
    protected BasicService<T, ID> service;

    protected BasicController(BasicService<T, ID> service) {
        this.service = service;
    }

    @GetMapping
    public List<T> findAll() {
        return service.findAll();
    }

    @GetMapping("/{entityId}")
    public T findById(@PathVariable ID entityId) {
        return service.findById(entityId).orElseThrow(() ->
                new IllegalArgumentException("Entity not found")
        );
    }

    @PostMapping
    public T save(@RequestBody T entity) {
        return service.save(entity);
    }

    @DeleteMapping("/{entityId}")
    public void deleteById(@PathVariable ID entityId) {
        service.deleteById(entityId);
    }
}
