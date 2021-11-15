package com.wrt.carspa.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ElasticsearchConfig {

    @Value("${elasticsearch.ip}")
    private String ipPort;

    @Bean
    public RestClientBuilder restClientBuilder(){
        return RestClient.builder(makeHttpHost(ipPort));
    }

    @Bean(name="highLevelClient")
    public RestHighLevelClient highLevelClient(@Autowired RestClientBuilder restClientBuilder){
        return new RestHighLevelClient(restClientBuilder);
    }

    private HttpHost makeHttpHost(String s){
        String[] address = s.split(":");
        String ip = address.length>1?address[0]:"";
        String port = address.length>1?address[1]:"";
        return new HttpHost(ip,Integer.parseInt(port),"http");
    }
}
