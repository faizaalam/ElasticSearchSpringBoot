package com.example.demo;


import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.core.IndexRequest;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.RestHighLevelClientBuilder;

public class IndexAndSearch {
    // Create the low-level client
    RestClient restClient = RestClient.builder(
            new HttpHost("localhost", 9200)).build();

    // Create the transport with a Jackson mapper
    Product product = new Product().setName("abc").setPrice(42.0).setType("Bag");
    IndexRequest<Object> indexRequest = new IndexRequest.Builder<>()
            .index("products")
            .id("abc")
            .document(product)
            .build();
    RestHighLevelClient esClient = new RestHighLevelClientBuilder(restClient)
            .setApiCompatibilityMode(true)
            .build();

}
