package com.soap;

import java.util.List;

import javax.jws.WebService;

import com.soap.model.Product;

@WebService(endpointInterface ="com.soap.ProductCatalogInterface")
public class ProductCatalog implements ProductCatalogInterface {

	ProductServiceImpl productService = new ProductServiceImpl();

	@Override
	public List<String> getProductCategories() {
		return productService.getProductCategories();

	}

	@Override
	public List<String> getProducts(String category) {
		return productService.getProducts(category);

	}

	@Override
	public Boolean addProducts(String category, String product) {
		return productService.addProducts(category, product);

	}

	@Override
	public List<Product> getProduct2(String category) {
		return productService.getProduct2(category);

	}

}
