package ute.bt_api_mobile.service;

import ute.bt_api_mobile.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> getProductsByCategoryId(Integer categoryId);

    List<Product> getTop10BestSellingProducts();

    List<Product> getTop10RecentProducts();
}
