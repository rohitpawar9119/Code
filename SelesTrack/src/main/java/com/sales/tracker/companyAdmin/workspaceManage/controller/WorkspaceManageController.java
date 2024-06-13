package com.sales.tracker.companyAdmin.workspaceManage.controller;

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

import com.sales.tracker.companyAdmin.workspaceManage.model.WorkspaceManage;
import com.sales.tracker.companyAdmin.workspaceManage.service.WorkspaceManageService;
/**
 * @author suyog
 *
 */
@RestController
@RequestMapping("/workspaceManage")
public class WorkspaceManageController {
	private static final Logger log = LoggerFactory.getLogger(WorkspaceManageController.class);
    String className="WorkspaceManageController";

	@Autowired
	private WorkspaceManageService workpaceService;

	@GetMapping("/msg")
	public String getCompany() {
		log.info("welcome to"+className+" /msg");
		log.error("the error in "+className+ " /msg");
		return "welcome to company workspace and management !!! ";
	}

	@PostMapping("/createWorkspace")
	public WorkspaceManage addPackage(@RequestBody WorkspaceManage workspace) {
		WorkspaceManage add = workpaceService.createWorkspace(workspace);
		log.info("welcome to"+className+" /createWorkspace");
		log.error("the error in "+className+ " /createWorkspace");
		return add;
	}

	@PutMapping("/editWorkspace")
	public WorkspaceManage editPackage(@RequestBody WorkspaceManage workspace) {
		WorkspaceManage edit = workpaceService.editWorkspace(workspace);
		log.info("welcome to"+className+" /editWorkspace");
		log.error("the error in "+className+ " /editWorkspace");
		return edit;
	}
	
	@GetMapping("/detailWorkspace")
	public List<WorkspaceManage> detailPackage(WorkspaceManage workspace) {
		List<WorkspaceManage> detail = workpaceService.detailWorkspace(workspace);
		log.info("welcome to"+className+" /detailWorkspace");
		log.error("the error in "+className+ " /detailWorkspace");
		return detail;
	}

	@GetMapping("/detailWorkspace/{id}")
	public WorkspaceManage packageById(@PathVariable("id") int id) {
		WorkspaceManage workById = workpaceService.workspaceById(id);
		log.info("welcome to"+className+"  /detailWorkspace/{id}");
		log.error("the error in "+className+ " /detailWorkspace/{id}");
		return workById;
	}

	@DeleteMapping("/deleteWorkspace/{id}")
	public void deletePlanPackage(@PathVariable("id") int id) {
		log.info("welcome to"+className+" /deleteWorkspace/{id}");
		log.error("the error in "+className+ " /deleteWorkspace/{id}");
		workpaceService.deleteWorkspace(id);

	}

}
