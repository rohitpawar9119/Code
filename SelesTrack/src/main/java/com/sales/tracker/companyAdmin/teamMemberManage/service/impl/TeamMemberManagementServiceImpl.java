package com.sales.tracker.companyAdmin.teamMemberManage.service.impl;

import java.util.List;

import com.sales.tracker.companyAdmin.teamMemberManage.repository.TeamMemberManagementRepository;
import com.sales.tracker.companyAdmin.teamMemberManage.service.TeamMemberManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.sales.tracker.companyAdmin.teamMemberManage.exception.TeamMemberNotFoundException;
import com.sales.tracker.companyAdmin.teamMemberManage.model.TeamMemberManagement;

@Service
public class TeamMemberManagementServiceImpl implements TeamMemberManagementService {
	@Autowired
    TeamMemberManagementRepository teamMemberRepository;

	@Override
	public TeamMemberManagement addTeamMember(TeamMemberManagement teamMemberManagement) {
		teamMemberManagement = teamMemberRepository.save(teamMemberManagement);
	
		
		return teamMemberManagement;

	}

	@Override
	public List<TeamMemberManagement> detailTeamMember() {
		return teamMemberRepository.findAll();

	}

	@Override
	public TeamMemberManagement editTeamMember(TeamMemberManagement teamMemberManagement) {

		TeamMemberManagement edit = teamMemberRepository.save(teamMemberManagement);
		return edit;
	}

	@Override
	public void deleteTeamMemberById(int id) {
		 if( teamMemberRepository.findById(id)==null) {
			 throw new TeamMemberNotFoundException("you entered wrong id"+HttpStatus.BAD_REQUEST);
		 }
		teamMemberRepository.deleteById(id);

	}

	@Override
	public TeamMemberManagement detailTeamMemberById(int id) {
		if( teamMemberRepository.findById(id)==null) {
			 throw new TeamMemberNotFoundException("you entered wrong id"+HttpStatus.BAD_REQUEST);
		 }
		TeamMemberManagement getMember = teamMemberRepository.findById(id);
		return getMember;
	}

}
