package com.zakat.finance_app.controller;

import com.zakat.finance_app.model.Category;
import com.zakat.finance_app.service.BasicService;
import com.zakat.finance_app.service.CategoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("categories")
public class CategoryTransaction extends BasicController<Category, Long> {
    private final CategoryService categoryService;

    public CategoryTransaction(CategoryService categoryService) {
        super(categoryService);
        this.categoryService = categoryService;
    }
}
