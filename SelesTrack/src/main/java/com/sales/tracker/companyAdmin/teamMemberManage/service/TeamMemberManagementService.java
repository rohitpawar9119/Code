package com.sales.tracker.companyAdmin.teamMemberManage.service;

import java.util.List;

import com.sales.tracker.companyAdmin.teamMemberManage.model.TeamMemberManagement;

/**
 * @author saurabh
 *
 */

public interface TeamMemberManagementService {

	public TeamMemberManagement addTeamMember(TeamMemberManagement teamMemberManagement);

	public List<TeamMemberManagement> detailTeamMember();

	public TeamMemberManagement editTeamMember(TeamMemberManagement teamMemberManagement);

	public void deleteTeamMemberById(int id);

	public TeamMemberManagement detailTeamMemberById(int id);

}
