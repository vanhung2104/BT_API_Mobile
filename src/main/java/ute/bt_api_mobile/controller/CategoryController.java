package ute.bt_api_mobile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ute.bt_api_mobile.entity.Category;
import ute.bt_api_mobile.service.impl.CategoryService;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> getAllCategories() {
        List<Category> categories = categoryService.findAll();
        System.out.println("Danh sách Categories: " + categories);
        for (Category category : categories) {
            System.out.println("Category ID: " + category.getId() + ", Cate Name: " + category.getCateName());
        }
        return ResponseEntity.ok(categories);
    }
}
