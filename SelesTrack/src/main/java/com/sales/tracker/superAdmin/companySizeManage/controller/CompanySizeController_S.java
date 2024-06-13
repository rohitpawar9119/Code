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

import com.sales.tracker.superAdmin.companySizeManage.model.CompanySizeModel_S;
import com.sales.tracker.superAdmin.companySizeManage.service.CompanySizeService_S;

/**
 * @author rohit
 *
 */
@RestController
@RequestMapping("/companySize_S")
public class CompanySizeController_S {
	private static final Logger log = LoggerFactory.getLogger(CompanySizeController_S.class);
	String className = "CompanySizeController_S";

//	@Autowired
//	private CompanySizeService companySizeService;

	@Autowired
	private CompanySizeService_S companySizeService_S;

	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping("/createCompanySize_S")
	public CompanySizeModel_S addCompanySize(@RequestBody CompanySizeModel_S companySizeModel_S) {
		CompanySizeModel_S save = companySizeService_S.addCompanySize(companySizeModel_S);
		log.info("welcome to" + className + " /createCompanySize_S");
		log.error("the error in " + className + " /createCompanySize_S");
		return save;
	}
//	@PostMapping("/createCompanySize")
//	public CompanySizeModel_MDB addCompanySize(@RequestBody CompanySizeModel_MDB companySizeModel_MDB) {
//		CompanySizeModel_MDB save = companySizeService_MDB.addCompanySize(companySizeModel_MDB);
//		log.info("welcome to"+className+" /createCompanySize");
//		log.error("the error in "+className+ " /createCompanySize");
//		return save;
//	}

	@GetMapping("/detailCompanySize_S")
	public List<CompanySizeModel_S> detailCompanySize(CompanySizeModel_S companySizeModel_S) {
		List<CompanySizeModel_S> detail = companySizeService_S.detailCompanySize(companySizeModel_S);
		log.info("welcome to" + className + " /detailCompanySize_S");
		log.error("the error in " + className + " /detailCompanySize_S");
		return detail;
	}
//	@GetMapping("/detailCompanySize")
//	public List<CompanySizeModel_MDB> detailCompanySize(CompanySizeModel_MDB companySizeModel_MDB) {
//		List<CompanySizeModel_MDB> detail = companySizeService_MDB.detailCompanySize(companySizeService_MDB);
//		log.info("welcome to"+className+" /detailCompanySize");
//		log.error("the error in "+className+ " /detailCompanySize");
//		return detail;
//	}

	@GetMapping("/detailCompanySize_S/{id}")
	public CompanySizeModel_S getCompany(@PathVariable("id") int id) {
		CompanySizeModel_S detailById = companySizeService_S.detailCompanySizeById(id);
		log.info("welcome to" + className + " /detailCompanySize_S/{id}");
		log.error("the error in " + className + " /detailCompanySize_S/{id}");
		return detailById;
	}
//	@GetMapping("/detailCompanySize/{id}")
//	public CompanySizeModel_MDB getCompany1(@PathVariable("id") int id) {
//		CompanySizeModel_MDB detailById1 = companySizeService_MDB.detailCompanySizeById(id);
//		log.info("welcome to"+className+" /detailCompanySize/{id}");
//		log.error("the error in "+className+ " /detailCompanySize/{id}");
//		return detailById1;
//	}

	@PutMapping("/editCompanySize_S")
	public CompanySizeModel_S editCompanySize(@RequestBody CompanySizeModel_S companySizeModel_S) {
		CompanySizeModel_S edit = companySizeService_S.editCompany(companySizeModel_S);
		log.info("welcome to" + className + " /editCompanySize_S");
		log.error("the error in " + className + " /editCompanySize_S");
		return edit;
	}
//	@PutMapping("/editCompanySize")
//	public CompanySizeModel_MDB editCompanySize(@RequestBody CompanySizeModel_MDB companySizeModel_MDB) {
//		CompanySizeModel_MDB edit = companySizeService_MDB.editCompany(companySizeModel_MDB);
//		log.info("welcome to"+className+" /editCompanySize");
//		log.error("the error in "+className+ " /editCompanySize");
//		return edit;
//	}

	@DeleteMapping("/deleteCompanySize_S/{id}")
	public void delete(@PathVariable("id") int id) {
		companySizeService_S.deleteCompanySize(id);
		log.info("welcome to" + className + " /deleteCompanySize_S/{id}");
		log.error("the error in " + className + " /deleteCompanySize_S/{id}");
	}
//	@DeleteMapping("/deleteCompanySize/{id}")
//	public void delete1(@PathVariable("id") int id) {
//		companySizeService_MDB.deleteCompanySize(id);
//		log.info("welcome to"+className+" /deleteCompanySize/{id}");
//		log.error("the error in "+className+ " /deleteCompanySize/{id}");
//
//	}
}
