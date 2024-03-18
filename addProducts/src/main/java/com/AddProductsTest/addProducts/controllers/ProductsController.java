package com.AddProductsTest.addProducts.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.AddProductsTest.addProducts.models.Product;
import com.AddProductsTest.addProducts.services.ProductRepository;

@Controller
@RequestMapping("/products")
public class ProductsController {
	
	@Autowired
	private ProductRepository repo;
	
	@GetMapping({"","/"})
	public String showProductList(Model model) {
		List<Product> products= repo.findAll();
		model.addAttribute("products", products);
		return "products/showProducts";
 	}
}
