package com.example.EmployeeWebService.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeWebService.dto.EmployeeDepartmentDTO;
import com.example.EmployeeWebService.entity.Employee;
import com.example.EmployeeWebService.response.EmployeeResponse;
import com.example.EmployeeWebService.service.EmployeeService;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	
			@Autowired
			EmployeeService employeeService;
			
			//http://localhost:8080/Employee/save
			@PostMapping("/save")
			public Employee insertDataIn(@RequestBody Employee employee) {
				return employeeService.saveDataIn(employee);
			}
			//http://localhost:8080/Employee/2
			@GetMapping("/{EmployeeId}")
			public ResponseEntity<EmployeeResponse> get(@PathVariable(value="EmployeeId")Long EmployeeId){
				EmployeeResponse employeeResponse=employeeService.getEmployeeByDepartmentId(EmployeeId);
				return ResponseEntity.ok().body(employeeResponse);
				
			}
			//http://localhost:9090/Employee/
			@GetMapping("/")
			public List<EmployeeDepartmentDTO> getAllIn(){
				return employeeService.getEmployeeWithDepartmentDetails();
					
			}
			@PutMapping("/update/{EmployeeId}")
			public ResponseEntity<Employee> updateDataIn(@PathVariable(value="EmployeeId")Long EmployeeId,
					@RequestBody Employee employee){
				Employee employee1=employeeService.updateEmployee(EmployeeId, employee);
				return ResponseEntity.ok().body(employee1);
				
			}
			@PatchMapping("/updateByColumn/{EmployeeId}")
			public ResponseEntity<Employee> updateByColumn(@PathVariable(value="EmployeeId")Long employeeId,
					@RequestBody Employee employee){
				Employee employee1=employeeService.updateByColumn(employeeId, employee);
				return ResponseEntity.ok().body(employee1);
				
			}
			
			@DeleteMapping("/deleteById/{EmployeeId}")
			public Map<String, Boolean> deleteById(@PathVariable(value="EmployeeId")Long EmployeeId){
				Map<String, Boolean> employee=employeeService.deleteByIdIn(EmployeeId);
				return employee;
				
			}
}
