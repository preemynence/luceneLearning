package com.preemynence.luceneLearning.repositories;

import com.preemynence.luceneLearning.model.Product;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.List;

public interface ProductRepository extends SolrCrudRepository<Product, String> {

	List<Product> findByName(String name);

}