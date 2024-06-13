package com.sales.tracker.superAdmin.industryManage.service.impl;

import java.util.List;

import com.sales.tracker.superAdmin.industryManage.exception.IndustryNotFoundException;
import com.sales.tracker.superAdmin.industryManage.repository.IndustryManageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.sales.tracker.superAdmin.industryManage.model.IndustryManage;
import com.sales.tracker.superAdmin.industryManage.service.IndustryManageService;

@Service
public class IndustryManageServiceImpl implements IndustryManageService {
	@Autowired
	private IndustryManageRepository industryRepository;

	@Override
	public IndustryManage addIndustry(IndustryManage industry) {
		IndustryManage add = industryRepository.save(industry);
		return add;
	}

	@Override
	public List<IndustryManage> detailIndustry(IndustryManage industry) {
		List<IndustryManage> detail = (List<IndustryManage>) industryRepository.findAll();
		return detail;
	}

	@Override
	public IndustryManage editIndustry(IndustryManage industry) {
		IndustryManage edit = industryRepository.save(industry);
		return edit;
	}

	@Override
	public IndustryManage detailIndutryById(int id) {
		IndustryManage indById = industryRepository.findById(id);
		if(indById==null)
		{
			throw new IndustryNotFoundException("You Entered Wrong Id"+HttpStatus.BAD_REQUEST);
		}
		return indById;
	}

	@Override
	public void deleteIndustry(int id) {
		if(industryRepository.findById(id)==null) {
			throw new IndustryNotFoundException("You Entered Wrong Id"+HttpStatus.BAD_REQUEST);
      }
		industryRepository.deleteById(id);

	}

//below services design by mahesh
//	public List<IndustryManage> getAllIndustry(){
//		Iterable<IndustryManage> findAll = this.industryRepository.findAll();
//		return (List<IndustryManage>) findAll;
//	}
//	public IndustryManage getIndustryById(int id) {
//		IndustryManage findById = this.industryRepository.findById(id);
//		return findById;
//	}
//	public IndustryManage addIndustry(IndustryManage industryManage) {
//		IndustryManage save = this.industryRepository.save(industryManage);
//       return save;
//	}
//	public void deleteIndustry(int id) {
//		 this.industryRepository.deleteById(id);
//	}
//	public IndustryManage updateIndustry(IndustryManage industry) {
//		IndustryManage saveIndustry=this.industryRepository.save(industry);
//		return saveIndustry;
//	}
}
