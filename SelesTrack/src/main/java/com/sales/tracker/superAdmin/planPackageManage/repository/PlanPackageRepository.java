package com.sales.tracker.superAdmin.planPackageManage.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sales.tracker.superAdmin.planPackageManage.model.PlanPackage;
@Repository
public interface PlanPackageRepository extends CrudRepository<PlanPackage,Integer>{

	public PlanPackage findById(int id);

	public PlanPackage deleteById(int id);
}
