package com.sales.tracker.superAdmin.modulesManage.service.impl;

import java.util.List;

import com.sales.tracker.superAdmin.modulesManage.exception.ModuleNotFoundException;
import com.sales.tracker.superAdmin.modulesManage.repository.ModulesManageRepository;
import com.sales.tracker.superAdmin.modulesManage.service.ModulesManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.sales.tracker.superAdmin.modulesManage.model.ModulesManage;

@Service
public class ModulesManageServiceImpl implements ModulesManageService {

	@Autowired
    ModulesManageRepository modulesRepository;

	@Override
	public ModulesManage addModules(ModulesManage modulesManage) {
		ModulesManage savemodules = modulesRepository.save(modulesManage);
		return savemodules;
	}

	@Override
	public List<ModulesManage> detailModule(ModulesManage modulesManage) {
		List<ModulesManage> detail = (List<ModulesManage>) modulesRepository.findAll();
		return detail;
	}

	@Override
	public ModulesManage editModules(ModulesManage modulesManage) {
		ModulesManage edit = modulesRepository.save(modulesManage);
		return edit;
	}

	@Override
	public ModulesManage detailModuleById(int id) {
		ModulesManage moduleById = modulesRepository.findById(id);
		if(moduleById==null) {
			throw new ModuleNotFoundException("You Entered Wrong Id "+HttpStatus.BAD_REQUEST);
		}
		return moduleById;
	}

	@Override
	public void deleteModule(int id) {
		if(modulesRepository.findById(id)==null) {
			throw new ModuleNotFoundException("You Entered Wrong Id "+HttpStatus.BAD_REQUEST);

		}
		modulesRepository.deleteById(id);

	}

}
