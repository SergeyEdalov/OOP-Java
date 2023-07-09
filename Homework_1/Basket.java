package Homeworks.Homework_1;

import java.util.ArrayList;


public class Basket {
    protected ArrayList<Product> buyProduct;

    public Basket() {
        this.buyProduct = new ArrayList<>();
    }


    public ArrayList<Product> getBuyProduct() {
        return buyProduct;
    }

    public void setBuyProduct(ArrayList<Product> buyProduct) {
        this.buyProduct = buyProduct;
    }

    public void addBuyProduct(Product product) {
        buyProduct.add(product);
    }

    public void removeProduct(Product product) {
        buyProduct.remove(product);
    }

    public void showBasket () {
        System.out.println("Корзина");
        for (Product product : buyProduct) {
            System.out.println("Товар = " + product.getName() + " " +
                    "Цена = " + product.getPrice() + " " +
                    "Категория = " + product.getRating());
        }
    }

}
