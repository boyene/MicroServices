	package com.example.EmployeeWebService.entity;
	
	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;
	
	@Entity
	@Table(name="Employee")
	public class Employee {
			@Id
			@GeneratedValue(strategy=GenerationType.IDENTITY)
			private Long EmployeeId;
			@Column(name="first_name",nullable=false)
			private String FirstName;
			@Column(name="last_name",nullable=false)
			private String LastName;
			@Column(name="email_id",nullable=false)
			private String EmailId;
			@Column(name="department_id",nullable=false)
			private Long departmentId;
			
			//No Argument Constructor
			public Employee() {
				
			}
			//Argument Constructor
	
			public Employee(Long studentId, String firstName, String lastName, String emailId, Long departmentId) {
				super();
				EmployeeId = studentId;
				FirstName = firstName;
				LastName = lastName;
				EmailId = emailId;
				this.departmentId = departmentId;
			}
	
			public Long getEmployeeId() {
				return EmployeeId;
			}
	
			public void setEmployeeId(Long studentId) {
				EmployeeId = studentId;
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
			
			
			
	}
