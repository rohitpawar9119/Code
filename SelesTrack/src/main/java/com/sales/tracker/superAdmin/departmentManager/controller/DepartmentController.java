package com.sales.tracker.superAdmin.departmentManager.controller;

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

import com.sales.tracker.superAdmin.departmentManager.model.DepartmentManager;
import com.sales.tracker.superAdmin.departmentManager.service.DepartmentManagerService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	private static final Logger log = LoggerFactory.getLogger(DepartmentController.class);
	String className = "DepartmentController";

	@Autowired
	DepartmentManagerService departmentService;

	@ResponseStatus(code = HttpStatus.CREATED )
	@PostMapping("/addDepartment")
	public DepartmentManager addDepartment(@RequestBody DepartmentManager departmentManager) {
		DepartmentManager add = departmentService.addDepartment(departmentManager);
		log.info("welcome to"+className+" /addDepartment");
		log.error("the error in "+className+ " /addDepartment");
		return add;
	}

	@GetMapping("/detailDepatrment")
	public List<DepartmentManager> detailDepartment(DepartmentManager departmentManager){
		List <DepartmentManager> detail=(List<DepartmentManager>) departmentService.detailDepartment(departmentManager);
		log.info("welcome to"+className+" /detailDepatrment");
		log.error("the error in "+className+ " /detailDepatrment");
		return detail;
	}

	@GetMapping("/detailDepatrment/{id}")
	public DepartmentManager getDepartment(@PathVariable("id") int id) {
		DepartmentManager deptById=departmentService.departmentById(id);
		log.info("welcome to"+className+" /detailDepatrment/{id}");
		log.error("the error in "+className+ " /detailDepatrment/{id}");
		return deptById;
	}

	@PutMapping("/editDepartment")
	public DepartmentManager editDepartment(@RequestBody DepartmentManager departmentManager) {
		DepartmentManager edit=departmentService.editDepartment(departmentManager);
		log.info("welcome to"+className+" /editDepartment");
		log.error("the error in "+className+ " /editDepartment");
		return edit;

	}

	
	@DeleteMapping("/deleteDepartment/{id}")
	public void  deleteDepartment(@PathVariable("id") int id) {
		log.info("welcome to"+className+" /deleteDepartment/{id}");
		log.error("the error in "+className+ " /deleteDepartment/{id}");
		departmentService.deleteDepartment(id);
		

	}
}
