package com.ramya;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.ramya.model.Product;

@WebService(targetNamespace="www.wsmart.com")
public interface ProductCatalogSEI {

	@WebMethod(action="WSMartGetCategoriesAction", operationName="getWSMartCategories")
	public abstract List<String> getProductCategories();

	@WebMethod
	public abstract List<String> getProductByCategory(String category);

	@WebMethod
	public abstract boolean addProductToCategory(String category, String product);

	@WebMethod
	public abstract List<Product> getProducts();

}