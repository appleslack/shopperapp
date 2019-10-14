package com.redtail.shopperapi.model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ProductInfo
 */

public class ProductInfo {

    public enum Size {
        SMALL,
        MEDIUM,
        LARGE,
        XLARGE
    }

    // Availability info tied to color and size
    public class Availability {
        
    }

    private String productName;
    private String id;
    private double price;
    private String imageURL;
    private List<String> colors;
    private List<Size> sizes;
    private Map<String /*colorSizeCombo*/, Availability> availabilityInfo;

    public ProductInfo(String productName, String id, double price, String imageURL) {
        this.productName = productName;
        this.id = id;
        this.price = price;
        this.imageURL = imageURL;
        
        this.colors = new ArrayList<>();
        this.sizes = new ArrayList<>();
        this.availabilityInfo = new HashMap<>();
    }
    
    public String getProductName() {
        return productName;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getImageURL() {
        return imageURL;
    }

    public List<String> getColors() {
        return colors;
    }

    public List<Size> getSizes() {
        return sizes;
    }

    public Map<String, Availability> getAvailabilityInfo() {
        return availabilityInfo;
    }

    public void setAvailabilityForColorAndSize(String color, Size size, boolean isAvailable ) {
        
    }
    
}