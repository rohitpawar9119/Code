package com.sales.tracker.superAdmin.companySizeManage.service;

	import java.util.List;

import com.sales.tracker.superAdmin.companySizeManage.model.CompanySizeModel_S;

	/**
	 * @author rohit
	 *
	 */
	public interface CompanySizeService_S {

		public CompanySizeModel_S addCompanySize(CompanySizeModel_S companySizeModel_S);

		public List<CompanySizeModel_S> detailCompanySize(CompanySizeModel_S companySizeModel_S);

		public CompanySizeModel_S editCompany(CompanySizeModel_S companySizeModel_S);

		public CompanySizeModel_S detailCompanySizeById(int id);

		public void deleteCompanySize(int id);

	}


