package com.example.EmployeeWebService.response;

import com.example.DepartmentWebService.response.DepartmentResponse;

public class EmployeeResponse {
      private Long EmployeeId;
      private String FirstName;
      private String LastName;
      private String EmailId;
      private Long departmentId;
      private DepartmentResponse departmentResponse;
	public Long getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(Long employeeId) {
		EmployeeId = employeeId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public DepartmentResponse getDepartmentResponse() {
		return departmentResponse;
	}
	public void setDepartmentResponse(DepartmentResponse departmentResponse) {
		this.departmentResponse = departmentResponse;
	}
      
      
      
}
