package com.aiop.yourtask.serviceinterface;


import java.util.List;

import com.aiop.yourtask.persistence.Role;
import com.aiop.yourtask.persistence.RoleDao;

public interface RoleServiceInterface {


	public void persist(Role entity);
	public void update(Role entity);
	public Role findById(int id);
	public void delete(Role entity);
	public List<Role> findAll();
	public void deleteAll();
	public RoleDao roleDao();
	
	
}
