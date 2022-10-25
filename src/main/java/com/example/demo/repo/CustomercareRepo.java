package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Customercare;

@Repository
public interface CustomercareRepo extends JpaRepository<Customercare, Long>{

}
