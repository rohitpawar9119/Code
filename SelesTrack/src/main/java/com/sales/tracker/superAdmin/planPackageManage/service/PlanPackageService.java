package com.sales.tracker.superAdmin.planPackageManage.service;

import java.util.List;

import com.sales.tracker.superAdmin.planPackageManage.model.PlanPackage;


public interface PlanPackageService {

	public PlanPackage addPackage(PlanPackage planPackage);
	
	public PlanPackage editPackage(PlanPackage planPackage);
	
//	public String updatePackage(PlanDto planDto);
	
	public List<PlanPackage> detailPackage(PlanPackage planPackage);
	
	public void deletePlanPackage(int id); 
	
	public PlanPackage packageById(int id);
}
