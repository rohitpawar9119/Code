package com.sales.tracker.superAdmin.modulesManage.service;

import java.util.List;

import com.sales.tracker.superAdmin.modulesManage.model.ModulesManage;
/**
 * @author saurabh
 *
 */

public interface ModulesManageService {

	public ModulesManage addModules(ModulesManage modulesManage);

	public List<ModulesManage> detailModule(ModulesManage modulesManage);

	public ModulesManage editModules(ModulesManage modulesManage);

	public ModulesManage detailModuleById(int id);

	public void deleteModule(int id);

}
