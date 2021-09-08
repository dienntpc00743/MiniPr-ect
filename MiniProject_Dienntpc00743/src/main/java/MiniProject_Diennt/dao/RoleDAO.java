package MiniProject_Diennt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import MiniProject_Diennt.entity.Role;

public interface RoleDAO extends JpaRepository<Role, Integer>{}
