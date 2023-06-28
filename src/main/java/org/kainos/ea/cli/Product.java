package org.kainos.ea.cli;

public class Product implements Comparable<Product> {

    private int productId;
    private String name;
    private String description;
    private float price;

    // CONSTRUCTOR
    public Product(int productId, String name, String description, float price) {
        setProductId(productId);
        setName(name);
        setDescription(description);
        setPrice(price);
    }

    // GETTERS AND SETTERS
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product product) {
        return Double.compare(this.getPrice(), product.getPrice());
    }

    @Override
    public String toString() {
        return "Product name: " + this.getName() + ", Product Price: £" + this.getPrice();
    }

}


