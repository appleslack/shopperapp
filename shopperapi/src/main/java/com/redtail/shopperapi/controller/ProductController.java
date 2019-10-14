package com.redtail.shopperapi.controller;

import com.redtail.shopperapi.model.ProductInfo;


/**
 * ProductController
 */
public class ProductController {

    ProductInfo getProductInfo( String productId, String storeId ) {
        ProductInfo productInfo = null;

        switch (storeId) {
            case "Bloomingdales":
                productInfo = null;
                break;
        
            default:
                break;
        }
        return productInfo;
    }
}