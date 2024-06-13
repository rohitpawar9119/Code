
package com.sales.tracker.superAdmin.roleAccessManage.service.impl;

import java.util.List;

import com.sales.tracker.superAdmin.roleAccessManage.exception.RoleAccessNotFoundExcception;
import com.sales.tracker.superAdmin.roleAccessManage.model.RoleAccess;
import com.sales.tracker.superAdmin.roleAccessManage.repository.RoleAccessRepository;
import com.sales.tracker.superAdmin.roleAccessManage.service.RoleAccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

/**
 * @author rohit
 *
 */
@Service
public class RoleAccessImpl implements RoleAccessService {
	@Autowired
    RoleAccessRepository roleAccessRepository;

	@Override
	public RoleAccess addRole(RoleAccess roleAccess) {
		RoleAccess addRole = roleAccessRepository.save(roleAccess);
		return addRole;

	}

	@Override
	public List<RoleAccess> detailRole() {
		List<RoleAccess> getAll = (List<RoleAccess>) roleAccessRepository.findAll();
		return getAll;
	}

	@Override
	public RoleAccess editRole(RoleAccess roleAccess) {

		RoleAccess editRole = roleAccessRepository.save(roleAccess);
		return editRole;
	}

	@Override
	public RoleAccess deatilRoleById(int id) {
		RoleAccess getById = roleAccessRepository.findById(id);
		if(getById==null) {
			throw new RoleAccessNotFoundExcception("You Entered Wrong Id "+HttpStatus.BAD_REQUEST);
		}
		return getById;

	}

	@Override
	public void deleteRole(int id) {
		if(roleAccessRepository.findById(id)==null) {
			throw new RoleAccessNotFoundExcception("You Entered Wrong Id "+HttpStatus.BAD_REQUEST);

		}
		roleAccessRepository.deleteById(id);

	}

}
