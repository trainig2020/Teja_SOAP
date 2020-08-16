package com.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.soap.model.Product;

@WebService(name = "testCatalog",  targetNamespace ="http://www.testmart.com")
public interface ProductCatalogInterface {
	@WebMethod
	List<String> getProductCategories();
	@WebMethod
	List<String> getProducts(String category);
	@WebMethod
	Boolean addProducts(String category, String product);
	@WebMethod
	@WebResult(name = "Product")
	List<Product> getProduct2(String category);

}