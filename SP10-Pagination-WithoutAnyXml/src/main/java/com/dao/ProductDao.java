package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.model.ProductBean;

@Repository
public class ProductDao 
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public List<ProductBean> getAllProductUsingJdbc(int pageId, int total)
	{
		String query="select * from Product limit "+(pageId-1)+","+total;
		
		List<ProductBean> allProductList = jdbcTemplate.query(query,new RowMapper<ProductBean>(){

			public ProductBean mapRow(ResultSet rs, int rowNum) throws SQLException {
				ProductBean productBean=new ProductBean();
				productBean.setId(rs.getInt(1));
				productBean.setDescription(rs.getString(2));
				productBean.setName(rs.getString(3));
				productBean.setPrice(rs.getInt(4));
				
				return productBean;
			}
			
		});
		
		return allProductList;
	}
	
	public List<ProductBean> getAllProductUsingHibernate(int pageId, int total) 
	{ 
		DetachedCriteria detachedCriteria=DetachedCriteria.forClass(ProductBean.class);
		List<ProductBean> allProductList = (List<ProductBean>) hibernateTemplate.findByCriteria(detachedCriteria, (pageId-1), total);
		
		//List<ProductBean> allProductList = hibernateTemplate.loadAll(ProductBean.class);
		
	  	return allProductList; 
	}
	 

}
