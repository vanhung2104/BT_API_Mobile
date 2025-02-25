package ute.bt_api_mobile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ute.bt_api_mobile.entity.Product;
import ute.bt_api_mobile.service.impl.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/category/{categoryId}")
    public ResponseEntity<List<Product>> getProductsByCategory(@PathVariable Integer categoryId) {
        List<Product> products = productService.getProductsByCategoryId(categoryId);
        return ResponseEntity.ok(products);
    }

    @GetMapping("/best-selling")
    public ResponseEntity<List<Product>> getTop10BestSellingProducts() {
        List<Product> products = productService.getTop10BestSellingProducts();
        return ResponseEntity.ok(products);
    }

    @GetMapping("/recent")
    public ResponseEntity<List<Product>> getTop10RecentProducts() {
        List<Product> products = productService.getTop10RecentProducts();
        return ResponseEntity.ok(products);
    }
}
