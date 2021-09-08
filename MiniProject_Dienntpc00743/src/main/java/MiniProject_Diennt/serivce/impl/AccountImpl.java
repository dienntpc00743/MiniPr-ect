package MiniProject_Diennt.serivce.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MiniProject_Diennt.dao.AccountDAO;
import MiniProject_Diennt.entity.Account;
import MiniProject_Diennt.entity.Product;
import MiniProject_Diennt.service.AccountService;

@Service
public class AccountImpl implements AccountService{
	
	@Autowired
	AccountDAO dao;
	
	@Override
	public Account findById(String name) {
		return dao.findById(name).get();
	}
	
	@Override
	public List<Account> getAdministrators() {
		return dao.getAdministrators();
	}
	
	@Override
	public List<Account> findAll() {
		return dao.findAll();
	}
	
	@Override
	public Account create(Account account) {
		return dao.save(account);
	}
	
	@Override
	public Account update(Account account) {
		return dao.save(account);
	}
	
	@Override
	public void deletefindById(String id) {
		dao.deleteById(id);
	}
	

}
