package com.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.soap.model.Product;

@WebService(name = "testCatalog", portName = "TestCatalogPort" , serviceName = "TestCatalogService"
, targetNamespace ="http://www.testmart.com")
public interface ProductCatalogInterface {
	@WebMethod
	List<String> getProductCategories();
	@WebMethod
	List<String> getProducts(String category);
	@WebMethod
	Boolean addProducts(String category, String product);
	@WebMethod
	List<Product> getProduct2(String category);

}