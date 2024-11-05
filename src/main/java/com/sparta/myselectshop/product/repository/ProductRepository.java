package com.sparta.myselectshop.product.repository;

import com.sparta.myselectshop.product.entity.Product;
import com.sparta.myselectshop.user.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {


    List<Product> findALlByUser(User user);

    Page<Product> findAllByUser(User user, Pageable pageable);
}
