package com.sales.tracker.superAdmin.departmentManager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sales.tracker.superAdmin.departmentManager.model.DepartmentManager;
@Repository
public interface DepartmentManagerRepository extends CrudRepository<DepartmentManager,Integer> {

	public DepartmentManager findById(int id);

	public DepartmentManager deleteById(int id);
}
