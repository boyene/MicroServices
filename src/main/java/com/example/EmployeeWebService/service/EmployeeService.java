package com.example.EmployeeWebService.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.DepartmentWebService.response.DepartmentResponse;
import com.example.EmployeeWebService.dto.EmployeeDepartmentDTO;
import com.example.EmployeeWebService.entity.Employee;
import com.example.EmployeeWebService.repository.EmployeeRepository;
import com.example.EmployeeWebService.response.EmployeeResponse;

@Service	
public class EmployeeService {
	
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	private ModelMapper mapper;
	
	public Employee saveDataIn(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public EmployeeResponse getEmployeeByDepartmentId(Long EmployeeId) {
		Optional<Employee> employee=employeeRepository.findById(EmployeeId);
		EmployeeResponse employeeResponse=mapper.map(employee, EmployeeResponse.class);
		
		DepartmentResponse departmentResponse=restTemplate.getForObject("http://localhost:9090/department/{departmentId}", DepartmentResponse.class,EmployeeId);
		employeeResponse.setDepartmentResponse(departmentResponse);
		return employeeResponse;
		
		
		
	}
	 public List<EmployeeDepartmentDTO> getEmployeeWithDepartmentDetails() {
	        List<Object[]> results = employeeRepository.fetchEmployeeWithDepartmentDetails();

	        return results.stream().map(row -> new EmployeeDepartmentDTO(
	            row[0] != null ? ((Number) row[0]).longValue() : null, // employeeId
	            (String) row[1], // emailId
	            (String) row[2], // firstName
	            (String) row[3], // lastName
	            (String) row[4], // departmentName
	            (String) row[5], // departmentAddress
	            (String) row[6]  // departmentCode
	        )).collect(Collectors.toList());
	    }
		
	
	//Update
	public Employee updateEmployee(Long EmployeeId ,Employee employeeUpdate) {
		Employee employee=employeeRepository.findById(EmployeeId).get();
		//save Data By setters and getters
		employee.setDepartmentId(employeeUpdate.getDepartmentId());
		employee.setEmailId(employeeUpdate.getEmailId());
		employee.setEmployeeId(employeeUpdate.getEmployeeId());
		employee.setFirstName(employeeUpdate.getFirstName());
		employee.setLastName(employeeUpdate.getLastName());
		Employee employee1=employeeRepository.save(employee);
		return employee1;
		
	}
		//Update By Column
	public Employee updateByColumn(Long EmployeeId,Employee employee1) {
		Employee employee=employeeRepository.findById(EmployeeId).get();
		if(employee1.getEmployeeId()!=0) {
			employee.setEmployeeId(employee1.getEmployeeId());
		}
		if(employee1.getFirstName()!=null) {
			employee.setFirstName(employee1.getFirstName());
		}
		if(employee1.getLastName()!=null) {
			employee.setLastName(employee1.getLastName());
		}
		if(employee1.getEmailId()!=null) {
			employee.setEmailId(employee1.getEmailId());
		}
		if(employee1.getDepartmentId()!=0) {
			employee.setDepartmentId(employee1.getDepartmentId());
		}
		Employee employee2=employeeRepository.save(employee);
		return employee2;
		
	}
	//delete
	public Map<String,Boolean> deleteByIdIn(Long EmployeeId) {
		Employee employee=employeeRepository.findById(EmployeeId).get()	;
		employeeRepository.delete(employee);
		Map<String ,Boolean> message=new HashMap<>();
		message.put("Delete Successfully!", true);
		return message;
		
	}
}
