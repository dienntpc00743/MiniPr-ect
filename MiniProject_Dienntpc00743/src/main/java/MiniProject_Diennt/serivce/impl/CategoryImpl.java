package MiniProject_Diennt.serivce.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MiniProject_Diennt.dao.CategoryDAO;
import MiniProject_Diennt.entity.Category;
import MiniProject_Diennt.service.CategoryService;

@Service
public class CategoryImpl implements CategoryService {
	
	@Autowired
	CategoryDAO cdao;

	@Override
	public List<Category> findAll() {

		return cdao.findAll();
	}

}
