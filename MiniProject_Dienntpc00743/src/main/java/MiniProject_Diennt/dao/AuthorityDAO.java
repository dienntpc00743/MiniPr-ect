package MiniProject_Diennt.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import MiniProject_Diennt.entity.Account;
import MiniProject_Diennt.entity.Authority;
import MiniProject_Diennt.entity.Category;

public interface AuthorityDAO  extends JpaRepository<Authority, Integer>{

	@Query("SELECT DISTINCT a FROM Authority a where a.account IN ?1 ")
	List<Authority> AuthorityOf(List<Account> accounts);

}
