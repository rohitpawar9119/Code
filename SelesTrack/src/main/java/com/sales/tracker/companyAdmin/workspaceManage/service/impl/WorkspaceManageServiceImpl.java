package com.sales.tracker.companyAdmin.workspaceManage.service.impl;

import java.util.List;

import com.sales.tracker.companyAdmin.workspaceManage.exception.WorkspaceNotFoundException;
import com.sales.tracker.companyAdmin.workspaceManage.model.WorkspaceManage;
import com.sales.tracker.companyAdmin.workspaceManage.repository.WorkspaceManageRepository;
import com.sales.tracker.companyAdmin.workspaceManage.service.WorkspaceManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class WorkspaceManageServiceImpl implements WorkspaceManageService {

	@Autowired
    WorkspaceManageRepository workspaceRepository;

	@Override
	public WorkspaceManage createWorkspace(WorkspaceManage workspace) {
		WorkspaceManage saveworkspace = workspaceRepository.save(workspace);
		return saveworkspace;
	}

	@Override
	public WorkspaceManage editWorkspace(WorkspaceManage workspace) {
		WorkspaceManage work = new WorkspaceManage();
		WorkspaceManage editwork = workspaceRepository.save(workspace);
		return editwork;
	}

	@Override
	public List<WorkspaceManage> detailWorkspace(WorkspaceManage workspace) {
		List<WorkspaceManage> detailwork = (List<WorkspaceManage>) workspaceRepository.findAll();
		return detailwork;
	}

	@Override
	public void deleteWorkspace(int id) {
		if(workspaceRepository.findById(id)==null) {
			throw new WorkspaceNotFoundException("You Entered Wrong Id"+HttpStatus.BAD_REQUEST);

		}
		workspaceRepository.deleteById(id);

	}

	@Override
	public WorkspaceManage workspaceById(int id) {
		WorkspaceManage workById = workspaceRepository.findById(id);
		if(workById==null) {
			throw new WorkspaceNotFoundException("You Entered Wrong Id"+HttpStatus.BAD_REQUEST);
		}
		return workById;
	}

}
