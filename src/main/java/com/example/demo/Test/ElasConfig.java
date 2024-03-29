//package com.example.demo.Test;
//
//import java.net.InetAddress;
//import java.net.InetSocketAddress;
//
//import org.elasticsearch.client.Client;
//import org.elasticsearch.client.transport.TransportClient;
//import org.elasticsearch.common.settings.Setting;
//import org.elasticsearch.common.settings.Settings;
//import org.elasticsearch.common.transport.TransportAddress;
//import org.elasticsearch.transport.client.PreBuiltTransportClient;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
//import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
//import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
//
//@Configuration
//@EnableElasticsearchRepositories(basePackages = "com.example.demo.model.elasticsearch")
//public class ElasConfig {
//
//	@Value("${spring.elasticsearch.jest.proxy.host}")
//	private String esHost;
//
//	@Value("${spring.elasticsearch.jest.proxy.port}")
//	private int esPort;
//
//	@Value("${spring.data.elasticsearch.cluster-name}")
//	private String esClusterName;
//
//	@Bean
//	public Client client() throws Exception {
//		Settings esSettings = Settings.builder().put("client.transport.sniff", true).put("cluster.name", esClusterName)
//				.build();
//		TransportClient client = new PreBuiltTransportClient(esSettings);
//		client.addTransportAddress(new TransportAddress(InetAddress.getByName(esHost), esPort));
//
//		return client;
//	}
//
//	@Bean
//	public ElasticsearchOperations elasticsearchTemplate() throws Exception {
//		return new ElasticsearchTemplate(client());
//	}
//
//}
