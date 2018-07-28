package com.semihonay.anuglarspringboot.repositories;

import com.semihonay.anuglarspringboot.models.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerModel, Long> {
}
