package MiniProject_Diennt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import MiniProject_Diennt.dao.AccountDAO;
import MiniProject_Diennt.entity.Account;
import MiniProject_Diennt.entity.Product;

public interface AccountService {
	
	
	public Account findById(String name);

	public List<Account> getAdministrators();

	public List<Account> findAll();

	public Account create(Account account);

	public Account update(Account account);

	public void deletefindById(String id);
}
