package com.example.EmployeeWebService.dto;

public class EmployeeDepartmentDTO {
	  private Long employeeId;
	    private String emailId;
	    private String firstName;
	    private String lastName;
	    private String dapartmentName;
	    private String departmentAddress;
	    private String departmentCode;
	    
	    public EmployeeDepartmentDTO(){
	    	
	    }

		public EmployeeDepartmentDTO(Long employeeId, String emailId, String firstName, String lastName,
				String dapartmentName, String departmentAddress, String departmentCode) {
			super();
			this.employeeId = employeeId;
			this.emailId = emailId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.dapartmentName = dapartmentName;
			this.departmentAddress = departmentAddress;
			this.departmentCode = departmentCode;
		}

		public Long getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(Long employeeId) {
			this.employeeId = employeeId;
		}

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getDapartmentName() {
			return dapartmentName;
		}

		public void setDapartmentName(String dapartmentName) {
			this.dapartmentName = dapartmentName;
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
