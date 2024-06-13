package com.sales.tracker.superAdmin.companySizeManage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.sales.tracker.superAdmin.companySizeManage.exception.CompanySizeMangeNotFoundException;
import com.sales.tracker.superAdmin.companySizeManage.model.CompanySizeModel_S;
import com.sales.tracker.superAdmin.companySizeManage.repository.CompanySizeRepository_S;
import com.sales.tracker.superAdmin.companySizeManage.service.CompanySizeService_S;

@Service
public class CompanySizeManagerImpl_S implements CompanySizeService_S {

	@Autowired
	private CompanySizeRepository_S companySizeRpository_S;

	@Override
	public CompanySizeModel_S addCompanySize(CompanySizeModel_S companySize_S) {
		CompanySizeModel_S save = companySizeRpository_S.save(companySize_S);
		return save;
	}

	@Override
	public List<CompanySizeModel_S> detailCompanySize(CompanySizeModel_S companySizeModel_S) {
		List<CompanySizeModel_S> detail = (List<CompanySizeModel_S>) companySizeRpository_S.findAll();
		return detail;
	}

	@Override
	public CompanySizeModel_S editCompany(CompanySizeModel_S companySize_S) {
		CompanySizeModel_S edit = companySizeRpository_S.save(companySize_S);
		return edit;
	}

	@Override
	public CompanySizeModel_S detailCompanySizeById(int id) {
		CompanySizeModel_S detailById = companySizeRpository_S.findById(id);
		if(detailById==null) {
			throw new CompanySizeMangeNotFoundException("You Entered Wrong Id 1"+HttpStatus.BAD_REQUEST);
			
		}
		return detailById;
	}

	@Override
	public void deleteCompanySize(int id) {
		if(companySizeRpository_S.findById(id)==null) {
			throw new CompanySizeMangeNotFoundException("You Entered Wrong Id "+HttpStatus.BAD_REQUEST);

		}
		companySizeRpository_S.deleteById(id);

	}

}
