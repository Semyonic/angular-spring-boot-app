package com.semihonay.anuglarspringboot.repositories;

import com.semihonay.anuglarspringboot.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductModel, Long> {

}
