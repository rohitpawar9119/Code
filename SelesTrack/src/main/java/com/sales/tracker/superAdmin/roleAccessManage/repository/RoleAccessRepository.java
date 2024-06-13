package com.sales.tracker.superAdmin.roleAccessManage.repository;
/**
 * @author rohit
 *
 */
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sales.tracker.superAdmin.roleAccessManage.model.RoleAccess;
@Repository
public interface RoleAccessRepository extends CrudRepository<RoleAccess, Integer> {
	public RoleAccess findById(int id);

	public RoleAccess deleteById(int id);
}
