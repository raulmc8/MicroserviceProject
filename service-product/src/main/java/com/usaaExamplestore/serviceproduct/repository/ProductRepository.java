package com.usaaExamplestore.serviceproduct.repository;

import com.usaaExamplestore.serviceproduct.entity.Category;
import com.usaaExamplestore.serviceproduct.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository  extends JpaRepository<Product, Long> {

    public List<Product> findByCategory(Category category);
}