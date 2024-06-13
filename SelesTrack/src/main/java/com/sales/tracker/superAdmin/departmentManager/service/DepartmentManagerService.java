package com.sales.tracker.superAdmin.departmentManager.service;

import java.util.List;

import com.sales.tracker.superAdmin.departmentManager.model.DepartmentManager;

public interface DepartmentManagerService {

	public DepartmentManager addDepartment(DepartmentManager departmentManager);

	public List<DepartmentManager> detailDepartment(DepartmentManager departmentManager);

	public DepartmentManager editDepartment(DepartmentManager departmentManager);

	public DepartmentManager departmentById(int id);

	public void deleteDepartment(int id);

	

}
