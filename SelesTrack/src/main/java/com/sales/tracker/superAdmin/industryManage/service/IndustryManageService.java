package com.sales.tracker.superAdmin.industryManage.service;

import java.util.List;

import com.sales.tracker.superAdmin.industryManage.model.IndustryManage;

/**
 * @author mahesh
 *
 */
public interface IndustryManageService {
	
	public IndustryManage addIndustry(IndustryManage industry);

	public List<IndustryManage> detailIndustry(IndustryManage industry);
	
	public IndustryManage editIndustry(IndustryManage industry);

	public IndustryManage detailIndutryById(int id);

	public void deleteIndustry(int id);

	

}
