package com.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.model.ProductBean;
import com.service.ProductService;

@Controller
public class ProductController 
{
	@Autowired
	private ProductService productService;
	
	private static final String UPLOAD_DIRECTORY="/WEB-INF/resources/images/";
			
	@RequestMapping("/showProductUsingJdbc/{pageId}")
	public String showProductUsingJdbc(@PathVariable int pageId,Model m)
	{
		System.out.println("usring jdbc");
		System.out.println("Page id "+pageId);
		
		int total=5;
		if(pageId==1) {}
		else
		{
			pageId=(pageId-1)*total+1;
		}
		
		List<ProductBean> allProductList = productService.getAllProductUsingJdbc(pageId,total);
		System.out.println(allProductList);
		
		m.addAttribute("products",allProductList);
		m.addAttribute("using","showProductUsingJdbc");
		
		return "showProd";
	}
	
	@RequestMapping("/showProductUsingHibernate/{pageId}")
	public String showProductUsingHibernate(@PathVariable int pageId,Model m)
	{
		System.out.println("usring hibernate");
		System.out.println("Page id "+pageId);
		
		int total=5;
		if(pageId==1) {}
		else
		{
			pageId=(pageId-1)*total+1;
		}
		
		List<ProductBean> allProductList = productService.getAllProductUsingHibernate(pageId,total);
		System.out.println(allProductList);
		
		m.addAttribute("products",allProductList);
		m.addAttribute("using","showProductUsingHibernate");

		return "showProd";
	}
	
	@RequestMapping("/uploadFile")
	public String uploadFile()
	{		
		return "uploadFile";
		
	}
	
	@RequestMapping(path = "/saveFile", method = RequestMethod.POST)
	public String saveFile(Model m,@RequestParam("file") CommonsMultipartFile file,HttpSession s) throws FileNotFoundException
	{
		System.out.println("file upload handler");
		System.out.println("file size - "+file.getSize());
		System.out.println("file name - "+file.getOriginalFilename());
		
		/*String path = s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+
				"resources"+File.separator+"images"+File.separator+file.getOriginalFilename();
		*/
		
		String path=s.getServletContext().getRealPath(UPLOAD_DIRECTORY)+file.getOriginalFilename();
		
		System.out.println("path === "+path);
		
		FileOutputStream fout=new FileOutputStream(path);
		try(fout)
		{
			byte[] bytes = file.getBytes();
			fout.write(bytes);
			System.out.println("file uploaded...");
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("uploading error...");

		}
		
		m.addAttribute("fileSuccess","File Uploaded Successfully");
		m.addAttribute("fileName",file.getOriginalFilename());
		return "uploadFile";
	}

}
