package MiniProject_Diennt.serivce.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MiniProject_Diennt.dao.ProductDAO;
import MiniProject_Diennt.entity.Product;
import MiniProject_Diennt.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductDAO proDao;

	@Override
	public List<Product> findAll() {
		return proDao.findAll();
	}

	@Override
	public Product findById(Integer id) {
		return proDao.findById(id).get();
	}

	@Override
	public List<Product> findByCategoryId(String cid) {
		return proDao.findByCategoryId(cid);
	}

	@Override
	public Product create(Product product) {
		return proDao.save(product);
	}

	@Override
	public Product update(Product product) {
		return proDao.save(product);
	}

	@Override
	public void deletefindById(Integer id) {
		 proDao.deleteById(id);
		
	}

	

	
}
