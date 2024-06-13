
package com.sales.tracker.superAdmin.roleAccessManage.controller;

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

import com.sales.tracker.superAdmin.roleAccessManage.model.RoleAccess;
import com.sales.tracker.superAdmin.roleAccessManage.service.RoleAccessService;
/**
 * @author rohit
 *
 */

@RestController
@RequestMapping("/roleManage")
public class RoleAccessController {
	private static final Logger log = LoggerFactory.getLogger(RoleAccessController.class);
	String className = "RoleAccessControllerb ";
	@Autowired
	RoleAccessService roleAccessService;
	
	@GetMapping("/msg")
	public String getMsg() {
		log.info("welcome to"+className+" /msg");
		log.error("the error in "+className+ " /msg");
		return "welcome to role management";
	}

	@PostMapping("/addRole")
	public RoleAccess addRole(@RequestBody RoleAccess roleAccess) {
		RoleAccess addRole = roleAccessService.addRole(roleAccess);	
		log.info("welcome to"+className+" /addRole");
		log.error("the error in "+className+ " /addRole");

		return addRole;
	}

	@GetMapping("/detailRole")
	public List<RoleAccess> roleAccess() {
		log.info("welcome to"+className+" /detailRole");
		log.error("the error in "+className+ " /detailRole");
		return roleAccessService.detailRole();

	}

	@GetMapping("/detailRole/{id}")
	public RoleAccess getSingleRecord(@PathVariable("id") int id) {
		RoleAccess getById = roleAccessService.deatilRoleById(id);
		log.info("welcome to"+className+" /detailRole/{id}");
		log.error("the error in "+className+ " /detailRole/{id}");
		return getById;
	}

	@PutMapping("/editRole")
	public RoleAccess update(@RequestBody RoleAccess roleAccess) {
		RoleAccess editRole = roleAccessService.editRole(roleAccess);
		log.info("welcome to"+className+" /editRole");
		log.error("the error in "+className+ " /editRole");
		return editRole;
	}

	@DeleteMapping("/deleteRole/{id}")
	public void deleteRole(@PathVariable("id") int id) {
		roleAccessService.deleteRole(id);
		log.info("welcome to"+className+" /deleteRole/{id}");
		log.error("the error in "+className+ " /deleteRole/{id}");
	}

}
