package com.sales.tracker.superAdmin.companySizeManage.service;

import java.util.List;

import com.sales.tracker.superAdmin.companySizeManage.model.CompanySizeModel;

/**
 * @author rohit
 *
 */
public interface CompanySizeService {

	public CompanySizeModel addCompanySize(CompanySizeModel companySizeModel);

	public List<CompanySizeModel> detailCompanySize(CompanySizeModel companySizeModel);

	public CompanySizeModel editCompany(CompanySizeModel companySizeModel);

	public CompanySizeModel detailCompanySizeById(int id);

	public void deleteCompanySize(int id);

}
