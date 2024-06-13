package com.sales.tracker.superAdmin.departmentManager.service.impl;

import java.util.List;

import com.sales.tracker.superAdmin.departmentManager.exception.DepartmentNotFoundException;
import com.sales.tracker.superAdmin.departmentManager.model.DepartmentManager;
import com.sales.tracker.superAdmin.departmentManager.repository.DepartmentManagerRepository;
import com.sales.tracker.superAdmin.departmentManager.service.DepartmentManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class DepartmentManagerServiceImpl implements DepartmentManagerService {

	@Autowired
    DepartmentManagerRepository departmentRepository;
	
	@Override
	public DepartmentManager addDepartment(DepartmentManager departmentManager) {
		DepartmentManager savedept=departmentRepository.save(departmentManager);
		return savedept;
	}

	@Override
	public List<DepartmentManager> detailDepartment(DepartmentManager departmentManager) {
		List<DepartmentManager> detaildept=(List<DepartmentManager>) departmentRepository.findAll();
		return detaildept;
	}

	@Override
	public DepartmentManager editDepartment(DepartmentManager departmentManager) {
		DepartmentManager editdept=departmentRepository.save(departmentManager);
		return editdept;
	}

	@Override
	public DepartmentManager departmentById(int id) {
		DepartmentManager deptById=departmentRepository.findById(id);
		if(deptById==null) {
			throw new DepartmentNotFoundException("You Entered Wrong Id"+HttpStatus.BAD_REQUEST);
		}
		return deptById;
	}

	@Override
	public void deleteDepartment(int id) {
		if(departmentRepository.findById(id)==null) {
			throw new DepartmentNotFoundException("You Entered Wrong Id"+HttpStatus.BAD_REQUEST);

		}
		departmentRepository.deleteById(id);
		
	}



}
