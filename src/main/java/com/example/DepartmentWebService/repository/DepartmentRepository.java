package com.example.DepartmentWebService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DepartmentWebService.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long>{

}
