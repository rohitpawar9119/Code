package com.sales.tracker.companyAdmin.clientManage.controller;

import java.util.List;

import com.sales.tracker.companyAdmin.clientManage.service.ClientManageService;
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

import com.sales.tracker.companyAdmin.clientManage.model.ClientManage;

/**
 * @author mahesh
 *
 */
@RestController
@RequestMapping("/clientManage")
public class ClientManageController {
	private static final Logger log = LoggerFactory.getLogger(ClientManageController.class);
      String className="ClientManageController";
	@Autowired
	private ClientManageService companyClientManageService;

	@GetMapping("/msg")
	public String getCompany() {
		return "welcome to company admin client manage page !!! ";
	}

	@PostMapping("/createClient")
	public ClientManage createCompany(@RequestBody ClientManage company) {
		
		ClientManage create = companyClientManageService.createCompany(company);
        log.info("welcome to"+className+" /createClient");
		log.error("the error in "+className+ " /createClient");
		return create;
	}

	@PutMapping("/editClient")
	public ClientManage editCompany(@RequestBody ClientManage company) {
		ClientManage edit = companyClientManageService.editCompany(company);
		log.info("welcome to"+className+" /editClient");
		log.error("the error in "+className+ " /editClient");
		return edit;
	}

	@GetMapping("/clientInformation")
	public List<ClientManage> companyInformation(ClientManage company) {
		List<ClientManage> getAll = companyClientManageService.companyInformation(company);
		log.info("welcome to"+className+" /clientInformation");
		log.error("the error in "+className+ " /clientInformation");
		return getAll;
	}

	@GetMapping("/clientInformation/{id}")
	public ClientManage getCompanyById(@PathVariable("id") int id) {
		ClientManage getCompanyById = companyClientManageService.getCompanyById(id);
		log.info("welcome to"+className+" /clientInformation/{id}");
		log.error("the error in "+className+ " /clientInformation/{id}");
		return getCompanyById;
	}

	@DeleteMapping("/deleteClient/{id}")
	public void deleteCompanyById(@PathVariable("id") int id) {
		log.info("welcome to"+className+" /deleteClient/{id}");
		log.error("the error in "+className+ " /deleteClient/{id}");
		companyClientManageService.deleteCompanyById(id);

	}

}
