package com.sales.tracker.companyAdmin.teamMemberManage.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sales.tracker.companyAdmin.teamMemberManage.model.TeamMemberManagement;
import com.sales.tracker.companyAdmin.teamMemberManage.service.TeamMemberManagementService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

/**
 * @author saurabh
 *
 */
@RestController
@SecurityRequirement(name="Bearer")
@RequestMapping("/teamMember")
public class TeamMemberManagementController {
	
	private static final Logger log = LoggerFactory.getLogger(TeamMemberManagementController.class);
     String className="TeamMemberManagementController";
	
	@Autowired
	TeamMemberManagementService teamService;
	
	@GetMapping("/msg")
	public String getMsg(){
		log.info("welcome to"+className+" /msg");
		log.error("the error in "+className+ " /msg");
		return"Welcome to team member management";
	}

	@PostMapping("/addTeamMember")
	public TeamMemberManagement addTeam(@RequestBody TeamMemberManagement teamMemberManagement) {
		teamMemberManagement = teamService.addTeamMember(teamMemberManagement);
		log.info("welcome to"+className+" /addTeamMember");
		log.error("the error in "+className+ " /addTeamMember");
		return teamMemberManagement;
	}

	@GetMapping("/detailTeamMember")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public List<TeamMemberManagement> getTeam() {
		log.info("welcome to"+className+" /detailTeamMember");
		log.error("the error in "+className+ " /detailTeamMember");
		return teamService.detailTeamMember();
	}

	@GetMapping("/detailTeamMember/{id}")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public TeamMemberManagement getTeamMember(@PathVariable("id") int id) {
		TeamMemberManagement getMember = teamService.detailTeamMemberById(id);
		log.info("welcome to"+className+" /detailTeamMember/{id}");
		log.error("the error in "+className+ " /detailTeamMember/{id}");
		return getMember;
	}

	@PutMapping("/editTeamMember")
	public TeamMemberManagement updateTeamMember(@RequestBody TeamMemberManagement teamMemberManagement) {
		TeamMemberManagement edit = teamService.editTeamMember(teamMemberManagement);
		log.info("welcome to"+className+" /editTeamMember");
		log.error("the error in "+className+ " /editTeamMember");
		return edit;

	}

	@DeleteMapping("/deleteTeamMember/{id}")
	public void deleteTeamMember(@PathVariable("id") int id) {
		teamService.deleteTeamMemberById(id);
		log.info("welcome to"+className+" /deleteTeamMember/{id}");
		log.error("the error in "+className+ " /deleteTeamMember/{id}");

	}

}
