package MiniProject_Diennt.serivce.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MiniProject_Diennt.dao.AccountDAO;
import MiniProject_Diennt.dao.AuthorityDAO;
import MiniProject_Diennt.entity.Account;
import MiniProject_Diennt.entity.Authority;
import MiniProject_Diennt.service.AuthorityService;

@Service
public class AuthorityImpl  implements AuthorityService{
	
	@Autowired
	AuthorityDAO dao;
	@Autowired
	AccountDAO cadao;
	
	@Override
	public List<Authority> findAll() {
		// TODO Auto-generated method stub
		return  dao.findAll() ;
	}

	@Override
	public List<Authority> findAuthoritiesOfAdministrators() {
		List<Account> accounts = cadao.getAdministrators();
 		return dao.AuthorityOf(accounts);
	}

	@Override
	public Authority create(Authority auth) {
		// TODO Auto-generated method stub
		return dao.save(auth);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

}
