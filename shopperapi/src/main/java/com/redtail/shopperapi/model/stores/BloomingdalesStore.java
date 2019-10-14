package com.redtail.shopperapi.model.stores;

import java.io.InputStream;
import java.net.URI;

import com.redtail.shopperapi.model.ProductInfo;
import com.redtail.shopperapi.model.Store;

import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.SimpleClientHttpRequestFactory;

/**
 * BloomingdalesStore
 */
public class BloomingdalesStore extends Store {

    public BloomingdalesStore() {
        super("bloomingdales");
    }

    @Override
    public ProductInfo buildProductInfoForProductId(String productId) {

        // Make the request and build
        ClientHttpRequest request = new ClientHttpRequest();

        return null;
    }
    
    public Object jsonForEndpoint( String endpoint ) {
        SimpleClientHttpRequestFactory clientHttpRequestFactory = new SimpleClientHttpRequestFactory();
        ClientHttpRequest request = clientHttpRequestFactory
                .createRequest(new URI("http://localhost:" + port + url), HttpMethod.GET);
        try {
            ClientHttpResponse response = request.execute();
            if (HttpStatus.NOT_FOUND.equals(response.getStatusCode())) {
                System.out.println("NOT FOUND");
            }
            try {
                InputStream is = response.getBody();
                
                // String actual = StreamUtils.copyToString(response.getBody(),
                //         Charset.forName("UTF-8"));
            }
            finally {
                response.close();
            }
        }
        catch (Exception ex) {
        }
    }
}