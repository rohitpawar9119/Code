package com.sales.tracker.superAdmin.modulesManage.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sales.tracker.superAdmin.modulesManage.model.ModulesManage;
@Repository
public interface ModulesManageRepository extends CrudRepository<ModulesManage,Integer>{

	public ModulesManage findById(int id);

	public ModulesManage deleteById(int id);
	

}
