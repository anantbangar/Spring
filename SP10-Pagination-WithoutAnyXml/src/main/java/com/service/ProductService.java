package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ProductDao;
import com.model.ProductBean;

@Service
public class ProductService 
{
	@Autowired
	private ProductDao productDao;
	
	public List<ProductBean> getAllProductUsingJdbc(int pageId, int total)
	{
		List<ProductBean> allProductList = productDao.getAllProductUsingJdbc(pageId,total);
		return allProductList;
	}
	
	public List<ProductBean> getAllProductUsingHibernate(int pageId, int total) 
	{ 
		List<ProductBean> allProductList = productDao.getAllProductUsingHibernate(pageId,total);
		return allProductList; 
	}

}
