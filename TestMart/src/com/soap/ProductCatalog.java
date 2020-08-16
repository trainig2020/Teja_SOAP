package com.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "testCatalog", portName = "TestCatalogPort" , serviceName = "TestCatalogService"
				, targetNamespace ="http://www.testmart.com")
public class ProductCatalog {
	
	ProductServiceImpl productService = new ProductServiceImpl();
	
	@WebMethod
	public List<String> getProductCategories(){
		return productService.getProductCategories();
		
	}
	@WebMethod
	public List<String> getProducts(String category){
		return productService.getProducts(category);
		
	}
	@WebMethod
	public Boolean addProducts(String category, String product){
		return productService.addProducts(category, product);
		
	}

}
