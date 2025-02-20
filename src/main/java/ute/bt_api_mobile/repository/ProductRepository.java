package ute.bt_api_mobile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ute.bt_api_mobile.entity.Product;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByCategoryId(Integer categoryId);
    List<Product> findTop10ByOrderBySoldQuantityDesc();
    List<Product> findTop10ByCreatedDateGreaterThanEqual(LocalDate date);
}
