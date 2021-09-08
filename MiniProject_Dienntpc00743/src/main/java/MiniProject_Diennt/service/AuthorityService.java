package MiniProject_Diennt.service;

import java.util.List;

import MiniProject_Diennt.entity.Authority;

public interface AuthorityService {

	public List<Authority> findAll();

	public List<Authority> findAuthoritiesOfAdministrators();

	public Authority create(Authority auth);

	public void delete(Integer id);

}
