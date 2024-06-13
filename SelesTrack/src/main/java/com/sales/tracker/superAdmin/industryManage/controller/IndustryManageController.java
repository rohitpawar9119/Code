package com.sales.tracker.superAdmin.industryManage.controller;

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

import com.sales.tracker.superAdmin.industryManage.model.IndustryManage;
import com.sales.tracker.superAdmin.industryManage.service.IndustryManageService;

/**
 * @author mahesh
 *
 */

@RestController
@RequestMapping("/industryManage")
public class IndustryManageController {
	private static final Logger log = LoggerFactory.getLogger(IndustryManageController.class);
	String className = "IndustryManageController";

	@Autowired
	private IndustryManageService industryService;

	@GetMapping("/msg")
	public String getCompany() {
		log.info("welcome to"+className+" /msg");
		log.error("the error in "+className+ " /msg");
		return "welcome to Industry Management !!! ";
	}

	@PostMapping("/addIndustry")
	public IndustryManage addIndustry(@RequestBody IndustryManage industry) {
		IndustryManage add = industryService.addIndustry(industry);
		log.info("welcome to"+className+" /addIndustry");
		log.error("the error in "+className+ " /addIndustry");
		return add;
	}

	@PutMapping("/editIndustry")
	public IndustryManage editIndustry(@RequestBody IndustryManage industry) {
		IndustryManage edit = industryService.addIndustry(industry);
		log.info("welcome to"+className+" /editIndustry");
		log.error("the error in "+className+ " /editIndustry");
		return edit;
	}

	@GetMapping("/detailIndustry")
	public List<IndustryManage> detailIndustry(IndustryManage industry) {
		List<IndustryManage> detail = (List<IndustryManage>) industryService.detailIndustry(industry);
		log.info("welcome to"+className+" /detailIndustry");
		log.error("the error in "+className+ " /detailIndustry");
		return detail;
	}

	@GetMapping("/detailIndustry/{id}")
	public IndustryManage industryById(@PathVariable("id") int id) {
		IndustryManage industryById = industryService.detailIndutryById(id);
		log.info("welcome to"+className+" /detailIndustry/{id}");
		log.error("the error in "+className+ " /detailIndustry/{id}");
		return industryById;
	}

	@DeleteMapping("/deleteIndustry/{id}")
	public void deleteIndustry(@PathVariable("id") int id) {
		log.info("welcome to"+className+" /deleteIndustry/{id}");
		log.error("the error in "+className+ " /deleteIndustry/{id}");
		industryService.deleteIndustry(id);

	}

}
