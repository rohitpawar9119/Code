package com.sales.tracker.companyAdmin.workspaceManage.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sales.tracker.companyAdmin.workspaceManage.model.WorkspaceManage;

@Repository
public interface WorkspaceManageRepository extends CrudRepository<WorkspaceManage, Integer> {

	public WorkspaceManage findById(int id);

	public WorkspaceManage deleteById(int id);
}
