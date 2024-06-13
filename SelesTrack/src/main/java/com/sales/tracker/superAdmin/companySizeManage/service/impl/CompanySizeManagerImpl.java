
package com.sales.tracker.superAdmin.companySizeManage.service.impl;

import java.util.List;

import com.sales.tracker.superAdmin.companySizeManage.repository.CompanySizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.sales.tracker.superAdmin.companySizeManage.exception.CompanySizeMangeNotFoundException;
import com.sales.tracker.superAdmin.companySizeManage.model.CompanySizeModel;
import com.sales.tracker.superAdmin.companySizeManage.service.CompanySizeService;

@Service
public class CompanySizeManagerImpl implements CompanySizeService {

	@Autowired
	private CompanySizeRepository companySizeRpository;

	@Override
	public CompanySizeModel addCompanySize(CompanySizeModel companySize) {
		CompanySizeModel save = companySizeRpository.save(companySize);
		return save;
	}

	@Override
	public List<CompanySizeModel> detailCompanySize(CompanySizeModel companySizeModel) {
		List<CompanySizeModel> detail = (List<CompanySizeModel>) companySizeRpository.findAll();
		return detail;
	}

	@Override
	public CompanySizeModel editCompany(CompanySizeModel companySize) {
		CompanySizeModel edit = companySizeRpository.save(companySize);
		return edit;
	}

	@Override
	public CompanySizeModel detailCompanySizeById(int id) {
		CompanySizeModel detailById = companySizeRpository.findById(id);
		if(detailById==null) {
			throw new CompanySizeMangeNotFoundException("You Entered Wrong Id 1"+HttpStatus.BAD_REQUEST);
			
		}
		return detailById;
	}

	@Override
	public void deleteCompanySize(int id) {
		if(companySizeRpository.findById(id)==null) {
			throw new CompanySizeMangeNotFoundException("You Entered Wrong Id "+HttpStatus.BAD_REQUEST);

		}
		companySizeRpository.deleteById(id);

	}

}
