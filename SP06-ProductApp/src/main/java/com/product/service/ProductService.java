package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.dao.ProductDao;
import com.product.model.ProductBean;

@Service
public class ProductService {
	
	@Autowired
	private ProductDao productDao;
	
	public void saveOrUpdateProduct(ProductBean productBean)
	{
		productDao.saveOrUpdateProduct(productBean);
	}
	
	public List<ProductBean> getAllProducts()
	{
		List<ProductBean> allProduct = productDao.getAllProduct();
		return allProduct;
	}
	
	public ProductBean getProduct(int productId)
	{
		ProductBean product = productDao.getProduct(productId);
		return product;
	}
	
	public void deleteProduct(int productId)
	{
		productDao.deleteProduct(productId);
	}

}
