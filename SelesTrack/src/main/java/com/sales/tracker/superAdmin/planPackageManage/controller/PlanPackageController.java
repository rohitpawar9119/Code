package com.sales.tracker.superAdmin.planPackageManage.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sales.tracker.superAdmin.planPackageManage.model.PlanPackage;

import com.sales.tracker.superAdmin.planPackageManage.service.PlanPackageService;
/**
 * @author suyog
 *
 */
@RestController
@RequestMapping("/planPackage")
public class PlanPackageController {
	private static final Logger log = LoggerFactory.getLogger(PlanPackageController.class);
	String className = "PlanPackageController";
	@Autowired
	private PlanPackageService planService;

	@GetMapping("/msg")
	public String getCompany() {
		log.info("welcome to"+className+" /msg");
		log.error("the error in "+className+ " /msg");
		return "welcome to company plans and packages !!! ";
	}

	@PostMapping("/addPackage")
	public PlanPackage addPackage(@RequestBody PlanPackage planPackage) {
		PlanPackage add = planService.addPackage(planPackage);
		log.info("welcome to"+className+" /addPackage");
		log.error("the error in "+className+ " /addPackage");
		return add;
	}

	@PutMapping("/editPackage")
	public PlanPackage editPackage(@RequestBody PlanPackage PlanPackage) {
		PlanPackage edit = planService.editPackage(PlanPackage);
		log.info("welcome to"+className+" /editPackage");
		log.error("the error in "+className+ " /editPackage");
		return edit;
	}
	
//	@PutMapping("/updatePackage")
//	public String updatePackage(@RequestBody PlanDto planDto) {
//		String edit = planService.updatePackage(planDto);
//		return edit;
//	}

	@GetMapping("/detailPackage")
	public List<PlanPackage> detailPackage(PlanPackage planPackage) {
		List<PlanPackage> detail = planService.detailPackage(planPackage);
		log.info("welcome to"+className+" /detailPackage");
		log.error("the error in "+className+ " /detailPackage");
		return detail;
	}

	@GetMapping("/Package/{id}")
	public PlanPackage packageById(@PathVariable("id") int id) {
		PlanPackage planById = planService.packageById(id);
		log.info("welcome to"+className+" /Package/{id}");
		log.error("the error in "+className+ " /Package/{id}");
		return planById;
	}

	@DeleteMapping("/deletePackage/{id}")
	public void deletePlanPackage(@PathVariable("id") int id) {
		planService.deletePlanPackage(id);
		log.info("welcome to"+className+" /deletePackage/{id}");
		log.error("the error in "+className+ " /deletePackage/{id}");

	}

}
