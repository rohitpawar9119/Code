package com.sales.tracker.superAdmin.industryManage.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sales.tracker.superAdmin.industryManage.model.IndustryManage;
@Repository
public interface IndustryManageRepository  extends CrudRepository<IndustryManage,Integer>{
	public IndustryManage findById(int id);
	
	public IndustryManage deleteById(int id);
}
