package com.example.DepartmentWebService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DepartmentWebService.entity.Department;
import com.example.DepartmentWebService.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	DepartmentRepository departmentRepository;

	// @Post Mapping
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);

	}

	// @Get Mapping
	public Department getDepartmentById(Long departmentId) {
		return departmentRepository.findById(departmentId).get();

	}

	public Department updateById(Long departmentId, Department department) {
		Department department1 = departmentRepository.findById(departmentId).get();
		department1.setDepartmentId(department.getDepartmentId());
		department1.setDapartmentName(department.getDapartmentName());
		department1.setDepartmentAddress(department.getDepartmentAddress());
		department1.setDepartmentCode(department.getDepartmentCode());
		Department department2 = departmentRepository.save(department1);
		return department2;

	}
	public Department updateByColumn(Long departmentId,Department department1) {
		Department department=departmentRepository.findById(departmentId).get();
		if(department1.getDepartmentId()!=0) {
			department.setDepartmentId(department1.getDepartmentId());
		}
		if(department1.getDapartmentName()!=null) {
			department.setDapartmentName(department1.getDapartmentName());
		}
		if(department1.getDepartmentAddress()!=null) {
			department.setDepartmentAddress(department1.getDepartmentAddress());
		}
		if(department1.getDepartmentCode()!=null) {
			department.setDepartmentCode(department1.getDepartmentCode());
		}
		Department department2=departmentRepository.save(department);
		return department2;
		
	}
		public String deleteById(Long departmentId)throws ResourseNotFoundException {
			Department department =departmentRepository.findById(departmentId).orElseThrow(
					()->new ResourseNotFoundException("Resourese Not Found For Enter Id  "+departmentId));
			departmentRepository.delete(department);
			return "Delete SuccessFully!!";
			
		}
}
