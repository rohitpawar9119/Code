package com.sales.tracker.superAdmin.roleAccessManage.service;
/**
 * @author rohit
 *
 */
import java.util.List;

import com.sales.tracker.superAdmin.roleAccessManage.model.RoleAccess;

public interface RoleAccessService {

	public RoleAccess addRole(RoleAccess roleAccess);

	public List<RoleAccess> detailRole();

	public RoleAccess editRole(RoleAccess roleAccess);

	public RoleAccess deatilRoleById(int id);

	public void deleteRole(int id);

}
