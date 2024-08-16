package com.example.DepartmentWebService.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="department")
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long departmentId;
	@Column
	private String departmentName;
	@Column
	private String departmentAddress;
	@Column
	private String departmentCode;
		
	//No Argument Constructors
	public Department() {
		
	}
	//Argumented Constructors

	public Department(Long departmentId, String dapartmentName, String departmentAddress, String departmentCode) {
		super();
		this.departmentId = departmentId;
		this.departmentName = dapartmentName;
		this.departmentAddress = departmentAddress;
		this.departmentCode = departmentCode;
	}
	//Getters and Setters

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDapartmentName() {
		return departmentName;
	}

	public void setDapartmentName(String dapartmentName) {
		this.departmentName = dapartmentName;
	}

	public String getDepartmentAddress() {
		return departmentAddress;
	}

	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	
	
}
