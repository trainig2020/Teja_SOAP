package com.soap;

import java.util.ArrayList;
import java.util.List;

import com.soap.model.Product;

public class ProductServiceImpl {
	
	List<String> books = new ArrayList<String>();
	List<String> movies = new ArrayList<String>();
	List<String> artists = new ArrayList<String>();
	
	
	
	
	public ProductServiceImpl() {
		books.add("Game of Thrones");
		books.add("Harry Potter");
		books.add("Mahabharat");
		
		movies.add("Thupakki");
		movies.add("Mersal");
		movies.add("Bigil");
		
		artists.add("Vijay");
		artists.add("Ajith");
		artists.add("Surya");
	}


	public List<String> getProductCategories(){
		List<String> categories = new ArrayList<String>();
		categories.add("Books");
		categories.add("Movies");
		categories.add("Artist");
		return categories;
	}
	
	public List<String> getProducts(String category){ 
		switch (category.toLowerCase()) {
		case "books":
			return books;
		case "movies":
			return movies;
		case "artist":
			return artists;
			
		}
		return null;
	}
	
	public Boolean addProducts(String category, String product){ 
		switch (category.toLowerCase()) {
		case "books":
			books.add(product);
			break;
		case "movies":
			 movies.add(product);
			 break;
		case "artist":
			 artists.add(product);
			 break;
		default:
			return false;
			
		}
		return true;
	}


	public List<Product> getProduct2(String category) {
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product("Harry Potter", "1234", 10000));
		productList.add(new Product("Game of Thrones", "567", 20000));
		return productList;
	}
	

}
