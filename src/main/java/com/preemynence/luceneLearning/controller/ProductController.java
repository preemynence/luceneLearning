package com.preemynence.luceneLearning.controller;

import com.preemynence.luceneLearning.model.Product;
import com.preemynence.luceneLearning.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	
	@GetMapping("/product")
	public List<Product> products(@RequestParam String name){
		return productRepository.findByName(name);
	}
}