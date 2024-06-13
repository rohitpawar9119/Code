package com.sales.tracker.superAdmin.companySizeManage.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sales.tracker.superAdmin.companySizeManage.model.CompanySizeModel;
import com.sales.tracker.superAdmin.companySizeManage.service.CompanySizeService;

/**
 * @author rohit
 *
 */
@RestController
@RequestMapping("/companySize")
public class CompanySizeController {
	private static final Logger log = LoggerFactory.getLogger(CompanySizeController.class);
	String className = "CompanySizeController";

	@Autowired
	private CompanySizeService companySizeService;

	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping("/createCompanySize")
	public CompanySizeModel addCompanySize(@RequestBody CompanySizeModel companySizeModel) {
		CompanySizeModel save = companySizeService.addCompanySize(companySizeModel);
		log.info("welcome to"+className+" /createCompanySize");
		log.error("the error in "+className+ " /createCompanySize");
		return save;

	}

	@GetMapping("/detailCompanySize")
	public List<CompanySizeModel> detailCompanySize(CompanySizeModel companySizeModel) {
		List<CompanySizeModel> detail = companySizeService.detailCompanySize(companySizeModel);
		log.info("welcome to"+className+" /detailCompanySize");
		log.error("the error in "+className+ " /detailCompanySize");
		return detail;
	}

	@GetMapping("/detailCompanySize/{id}")
	public CompanySizeModel getCompany(@PathVariable("id") int id) {
		CompanySizeModel detailById = companySizeService.detailCompanySizeById(id);
		log.info("welcome to"+className+" /detailCompanySize/{id}");
		log.error("the error in "+className+ " /detailCompanySize/{id}");
		return detailById;
	}

	@PutMapping("/editCompanySize")
	public CompanySizeModel editCompanySize(@RequestBody CompanySizeModel companySizeModel) {
		CompanySizeModel edit = companySizeService.editCompany(companySizeModel);
		log.info("welcome to"+className+" /editCompanySize");
		log.error("the error in "+className+ " /editCompanySize");
		return edit;

	}

	@DeleteMapping("/deleteCompanySize/{id}")
	public void delete(@PathVariable("id") int id) {
		companySizeService.deleteCompanySize(id);
		log.info("welcome to"+className+" /deleteCompanySize/{id}");
		log.error("the error in "+className+ " /deleteCompanySize/{id}");
	}
}
