package com.shane.boot.repositories;

import com.shane.boot.Alba;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbaRepository extends JpaRepository<Alba, String>{
    
}
