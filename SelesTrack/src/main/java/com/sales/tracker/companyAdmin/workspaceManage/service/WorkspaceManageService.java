package com.sales.tracker.companyAdmin.workspaceManage.service;

import java.util.List;

import com.sales.tracker.companyAdmin.workspaceManage.model.WorkspaceManage;

public interface WorkspaceManageService {

	public WorkspaceManage createWorkspace(WorkspaceManage workspace);

	public WorkspaceManage editWorkspace(WorkspaceManage workspace);

	public List<WorkspaceManage> detailWorkspace(WorkspaceManage workspace);

	public void deleteWorkspace(int id);

	public WorkspaceManage workspaceById(int id);
	
//	a.	Create Workspace
//	b.	Edit Workspace
//	c.	Delete Workspace
//	d.	Detail Workspace
//	e.	Export Workspace
//	f.	Import Workspace

}
