package org.kainos.ea.core;

import org.kainos.ea.cli.ProductRequest;

public class ProductValidator {
    public String isValidProduct(ProductRequest product) {
        if (product.getName().length() > 50) {
            return "Name exceeds maximum allowed length of 50 characters.";
        }
        if (product.getDescription().length() > 500) {
            return "Description exceeds maximum allowed length of 500 characters.";
        }
        if (product.getPrice() > 1000000) {
            return "Price exceeds the maximum allowed value of £1,000,000.";
        }
        return null;
    }
}
