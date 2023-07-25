package com.oncode.ecoment.repository;

import com.oncode.ecoment.entity.Customer;
import com.oncode.ecoment.entity.dto.CustomerDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>  {
}
