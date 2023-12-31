package com.wanpos.app.repository;

import com.wanpos.app.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

    @Query(value = "SELECT * FROM category WHERE uuid = :uuid AND status = 'active'", nativeQuery = true)
    CategoryEntity findByUUID(@Param("uuid") String uuid);

    @Query(value = "SELECT * FROM category WHERE category_code = :category_code AND status = 'active'", nativeQuery = true)
    CategoryEntity findByCategoryCode(@Param("category_code") String category_code);

}
