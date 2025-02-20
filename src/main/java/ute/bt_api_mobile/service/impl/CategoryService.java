package ute.bt_api_mobile.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ute.bt_api_mobile.entity.Category;
import ute.bt_api_mobile.repository.CategoryRepository;
import ute.bt_api_mobile.service.ICategoryService;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

}
