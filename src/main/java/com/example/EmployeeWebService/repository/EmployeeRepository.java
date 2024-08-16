package com.example.EmployeeWebService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.EmployeeWebService.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
	@Query(
	        value = "SELECT e.employee_id, e.email_id, e.first_name, e.last_name, " +
	                "d.department_name, d.department_address, d.department_code " +
	                "FROM Employee e " +
	                "RIGHT JOIN Department d ON e.department_id = d.department_id " +
	                "LIMIT 0, 1000",
	        nativeQuery = true
	    )
	    List<Object[]> fetchEmployeeWithDepartmentDetails();

}
