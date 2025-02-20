package ute.bt_api_mobile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ute.bt_api_mobile.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{
}
