package Homeworks.Homework_1;

import java.util.ArrayList;

public class Category {
    private String name;
    protected ArrayList<Product> products;


    public Category(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProduct() {
        return products;
    }

    public void setProduct(ArrayList<Product> product) {
        this.products = product;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

}



