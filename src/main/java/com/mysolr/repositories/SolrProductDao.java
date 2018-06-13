package com.mysolr.repositories;

import com.mysolr.document.Product;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolrProductDao extends SolrCrudRepository<Product,String>{
}
