package com.product.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.product.model.ProductBean;

@Repository
public class ProductDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void saveOrUpdateProduct(ProductBean productBean)
	{
		hibernateTemplate.saveOrUpdate(productBean);
		
	}
	
	public List<ProductBean> getAllProduct()
	{
		
		  List<ProductBean> productBeans =
		  hibernateTemplate.loadAll(ProductBean.class);
		  
		  return productBeans;
		 
	}
	
	public ProductBean getProduct(int productId)
	{
		ProductBean product = hibernateTemplate.get(ProductBean.class,productId);
		return product;
	}
	
	@Transactional
	public void deleteProduct(int productId)
	{
		ProductBean productBean = hibernateTemplate.load(ProductBean.class,productId);
		hibernateTemplate.delete(productBean);
				
	}

}
