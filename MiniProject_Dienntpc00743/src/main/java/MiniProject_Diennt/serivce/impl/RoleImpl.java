package MiniProject_Diennt.serivce.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MiniProject_Diennt.dao.RoleDAO;
import MiniProject_Diennt.entity.Role;
import MiniProject_Diennt.service.RoleService;

@Service
public class RoleImpl implements RoleService {
	
	@Autowired
	RoleDAO dao ;
	@Override
	public List<Role> findAll() {
		return dao.findAll();
	}

}
