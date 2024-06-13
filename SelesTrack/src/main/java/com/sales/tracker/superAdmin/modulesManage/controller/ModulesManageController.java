package com.sales.tracker.superAdmin.modulesManage.controller;

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

import com.sales.tracker.superAdmin.modulesManage.model.ModulesManage;
import com.sales.tracker.superAdmin.modulesManage.service.ModulesManageService;
/**
 * @author saurabh
 *
 */
@RestController
@RequestMapping("/modulesManage")
public class ModulesManageController {
	private static final Logger log = LoggerFactory.getLogger(ModulesManageController.class);
	String className = "ModulesManageController";
	@Autowired
	ModulesManageService moduleService;

	@GetMapping("/msg")
	public String getCompany() {
		log.info("welcome to"+className+" /msg");
		log.error("the error in "+className+ " /msg");
		return "welcome to company modules management !!! ";
	}

	@PostMapping("/addModules")
	public ModulesManage addModule(@RequestBody ModulesManage modulesManage) {
		ModulesManage add = moduleService.addModules(modulesManage);
		log.info("welcome to"+className+" /addModules");
		log.error("the error in "+className+ " /addModules");
		return add;
	}

	@GetMapping("/detailModule")
	public List<ModulesManage> detailModule(ModulesManage modulesManage) {
		List<ModulesManage> detail = moduleService.detailModule(modulesManage);
		log.info("welcome to"+className+" /detailModule");
		log.error("the error in "+className+ " /detailModule");
		return detail;

	}

	@GetMapping("/detailModule/{id}")
	public ModulesManage detailModule(@PathVariable("id") int id) {
		ModulesManage detailById = moduleService.detailModuleById(id);
		log.info("welcome to"+className+" /detailModule/{id}");
		log.error("the error in "+className+ " /detailModule/{id}");
		return detailById;
	}

	@ResponseStatus(HttpStatus.ACCEPTED)
	@PutMapping("/editModules")
	public ModulesManage editModules(@RequestBody ModulesManage modulesManage) {
		ModulesManage edit = moduleService.editModules(modulesManage);
		log.info("welcome to"+className+" /editModules");
		log.error("the error in "+className+ " /editModules");
		return edit;

	}

	@ResponseStatus(HttpStatus.ACCEPTED)
	@DeleteMapping("/deleteModule/{id}")
	public void deleteModule(@PathVariable int id) {
		log.info("welcome to"+className+" /deleteModule/{id}");
		log.error("the error in "+className+ " /deleteModule/{id}");
		moduleService.deleteModule(id);

	}

}
