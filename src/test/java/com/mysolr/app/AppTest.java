package com.mysolr.app;

import com.mysolr.document.Product;
import com.mysolr.repositories.SolrProductDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {

    @Autowired
    private SolrProductDao solrProductDao;

    @Test
    public void test_findAllAvailableDocuments(){

        solrProductDao.findAll().forEach(System.out::println);

        Set<Product> products = new HashSet<>();
        Product product = new Product();
        product.setName("Shahrukh Khan");product.setCity("Mumbai");product.setMobile(BigInteger.valueOf(1326472842L).longValue());
        Product productOne = new Product();
        productOne.setName("RajniKant");productOne.setCity("Chennai");productOne.setMobile(BigInteger.valueOf(7266317281L).longValue());
        Product productTwo = new Product();
        productTwo.setName("Tom Cruise");productTwo.setCity("United States");productTwo.setMobile(BigInteger.valueOf(5623348712L).longValue());

        products.add(product);products.add(productOne);products.add(productTwo);

        solrProductDao.saveAll(products);

        solrProductDao.deleteAll();
    }

}
