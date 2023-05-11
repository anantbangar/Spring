package com.product.controler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.product.model.ProductBean;
import com.product.service.ProductService;

@Controller
public class ProductControler {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/")
	public String home(Model model)
	{
		List<ProductBean> products = productService.getAllProducts();
		model.addAttribute("products", products);
		return "homePage";
	}
	
	@RequestMapping(path = "/addProduct", method = RequestMethod.POST)
	public String addProduct()
	{
		return "addProduct";
	}
	
	@RequestMapping(path = "/saveOrUpdateProduct", method = RequestMethod.POST)
	public RedirectView saveOrUpdateProduct(@ModelAttribute ProductBean productBean, HttpServletRequest request)
	{
		productService.saveOrUpdateProduct(productBean);
		
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/"); 
		return redirectView;
			
		//return "redirect:/";
	}
	
	@RequestMapping(path = "/deleteProduct/{productId}")
	public String deleteProduct(@PathVariable("productId") int productId,HttpServletRequest request)
	{
		productService.deleteProduct(productId);
		
		/*
		 * RedirectView redirectView=new RedirectView();
		 * redirectView.setUrl(request.getContextPath()+"/"); 
		 * return redirectView;
		 */
		
		return "redirect:/";
		
	}
	
	@RequestMapping(path = "/updateProduct/{productId}")
	public String updateProduct(@PathVariable("productId") int productId,Model m)
	{
		ProductBean product = productService.getProduct(productId);
		m.addAttribute("product",product);
		return "updateProduct";
		
	}
	
	

}
