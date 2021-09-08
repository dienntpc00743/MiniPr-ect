package MiniProject_Diennt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import MiniProject_Diennt.entity.Category;

public interface CategoryDAO extends JpaRepository<Category, String>{}
