package com.sales.tracker.superAdmin.planPackageManage.service.impl;

import java.util.List;

import com.sales.tracker.superAdmin.planPackageManage.exception.PlanPackageNotFoundException;
import com.sales.tracker.superAdmin.planPackageManage.repository.PlanPackageRepository;
import com.sales.tracker.superAdmin.planPackageManage.service.PlanPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.sales.tracker.superAdmin.planPackageManage.model.PlanPackage;

@Service
public class PlanPackageServiceImpl implements PlanPackageService {

	@Autowired
    PlanPackageRepository planRepository;
	
	@Override
	public PlanPackage addPackage(PlanPackage planPackage) {
		PlanPackage savePlan=planRepository.save(planPackage);
		return savePlan;
	}

	@Override
	public PlanPackage editPackage(PlanPackage planPackage) {
		PlanPackage editPlan=planRepository.save(planPackage);
		return editPlan;
	}

	@Override
	public List<PlanPackage> detailPackage(PlanPackage planPackage) {
		List<PlanPackage> detailPlan=(List<PlanPackage>) planRepository.findAll();
		return detailPlan;
	}

	@Override
	public void deletePlanPackage(int id) {
		if(planRepository.findById(id)==null) {
			throw new PlanPackageNotFoundException("You enter wrong id"+HttpStatus.BAD_REQUEST);

		}
		
		planRepository.deleteById(id);
		
	}

	@Override
	public PlanPackage packageById(int id) {
		PlanPackage planById=planRepository.findById(id);
		if(planById==null) {
			throw new PlanPackageNotFoundException("You enter wrong id"+HttpStatus.BAD_REQUEST);
		}
		return planById;
	}

//	@Override
//	public String updatePackage(PlanDto planDto) {
//		PlanPackage plan = new PlanPackage(
//				planDto.getName(),
//				planDto.getPackageId(),
//				planDto.getPackageCost(),
//				planDto.getModules(),
//				planDto.getStatus(),
//				planDto.getUpdated(),
//				planDto.getUserLimit()
//					);
//		planRepository.save(plan);
//		return plan.getName();
//	}

}
