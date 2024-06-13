package com.sales.tracker.companyAdmin.teamMemberManage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sales.tracker.companyAdmin.teamMemberManage.model.TeamMemberManagement;
//import org.springframework.data.repository.CrudRepository;
@Repository
public interface TeamMemberManagementRepository extends JpaRepository<TeamMemberManagement, Integer> {
	public TeamMemberManagement findById(int id);

	public TeamMemberManagement deleteById(int id);

}
