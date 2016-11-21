//package com.aiop.yourtask.web.rest;
//
//import java.util.LinkedHashSet;
//import java.util.List;
//import java.util.Set;
//
//import javax.xml.bind.annotation.XmlRootElement;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.aiop.yourtask.dao.ProductDAO;
//import com.aiop.yourtask.domain.Product;
//import com.aiop.yourtask.service.ProductService;
//
//@XmlRootElement(name = "Product")
//public class RestResponseList {
//	
//	@Autowired
//	private ProductDAO productDAO;
//	
//	public LinkedHashSet<Product> getList() {
//		Set<Product> listeProducts = productDAO.findAllProducts(); 
//		LinkedHashSet<Product> fooList= new LinkedHashSet<Product>();
//        for(Product produit: listeProducts){
//        	System.out.println(produit.toString());
//		    fooList.add(produit);
//		}
//        System.out.println(fooList.toString());
//        //RestResponseList books=new RestResponseList();
//        //books.setList(fooList);
//		return fooList;
//	}
//
//	public void setList(List<Object> list) {
//	}
//}