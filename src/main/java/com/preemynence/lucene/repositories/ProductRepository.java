package com.preemynence.lucene.repositories;

import com.preemynence.lucene.model.Product;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.List;

public interface ProductRepository extends SolrCrudRepository<Product, String> {

	List<Product> findByName(String name);

}