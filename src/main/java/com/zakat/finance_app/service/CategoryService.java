package com.zakat.finance_app.service;

import com.zakat.finance_app.model.Category;
import com.zakat.finance_app.repository.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService extends BasicService<Category, Long> {
    private final CategoryRepository categoryRepository;

    protected CategoryService(CategoryRepository categoryRepository) {
        super(categoryRepository);
        this.categoryRepository = categoryRepository;
    }
}
