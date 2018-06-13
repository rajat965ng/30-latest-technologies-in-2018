package com.mysolr.document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.math.BigInteger;

@Setter
@Getter
@ToString
@SolrDocument(solrCoreName = "employeeCatalogue")
public class Product {


    @Id
    @Indexed(name = "name", type = "string")
    private String name;
    @Indexed(name = "city", type = "string")
    private String city;
    @Indexed(name = "mobile", type = "number")
    private Long mobile;



}
