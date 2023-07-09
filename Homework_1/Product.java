package Homeworks.Homework_1;

import java.util.ArrayList;

public class Product {
    private String name;
    private Double price;
    private String rating;

    public Product(String name, Double price, String rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }


}
