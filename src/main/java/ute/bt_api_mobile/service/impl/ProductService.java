package ute.bt_api_mobile.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ute.bt_api_mobile.entity.Product;
import ute.bt_api_mobile.repository.ProductRepository;
import ute.bt_api_mobile.service.IProductService;

import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getProductsByCategoryId(Integer categoryId) {
        return productRepository.findByCategoryId(categoryId);
    }

    @Override
    public List<Product> getTop10BestSellingProducts() {
        return productRepository.findTop10ByOrderBySoldQuantityDesc();
    }
}
