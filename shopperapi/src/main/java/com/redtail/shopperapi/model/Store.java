package com.redtail.shopperapi.model;

public abstract class Store {
    private final String storeId;
    public abstract ProductInfo buildProductInfoForProductId( String productId );

    protected Store(String storeId) {
        this.storeId = storeId;
    }

    public String getStoreId() {
        return storeId;
    }
    
}