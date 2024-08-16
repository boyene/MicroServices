package com.example.DepartmentWebService.controller;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.DepartmentWebService.entity.Department;
import com.example.DepartmentWebService.service.DepartmentService;
import com.example.DepartmentWebService.service.ResourseNotFoundException;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;

	// http://localhost:8080/department/save
	@PostMapping("/save")
	public Department saveDataIn(@RequestBody Department department) {
		return departmentService.saveDepartment(department);

	}

	@GetMapping("getBy/{departmentId}")
	public Department getByIdIn(@PathVariable(value = "departmentId") Long departmentId) {
		return departmentService.getDepartmentById(departmentId);

	}

	@PutMapping("/updateById/{departmentId}")
	public ResponseEntity<Department> updateById(@PathVariable(value = "departmentId") Long departmentId,
			@RequestBody Department department) {
		Department department1 = departmentService.updateById(departmentId, department);
		return ResponseEntity.ok().body(department1);

	}

	@PatchMapping("/updateByColumn/{departmentId}")
	public ResponseEntity<Department> updateByColumnIn(@PathVariable(value = "departmentId") Long departmentId,
			@RequestBody Department department) {
		Department department1 = departmentService.updateByColumn(departmentId, department);
		return ResponseEntity.ok(department1);

	}

	// http://localhost:8080/department/delete/k?departmentId=2
	@DeleteMapping("/delete/k")
	public ResponseEntity<String> deleteByIdIn(@RequestParam(value = "departmentId") Long departmentId) throws ResourseNotFoundException {
		String department = departmentService.deleteById(departmentId);
		return ResponseEntity.ok().body(department);

	}

}
