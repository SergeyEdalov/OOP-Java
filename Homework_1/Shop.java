package Homeworks.Homework_1;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Category> categories;

    public Shop() {
        this.categories = new ArrayList<>();
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    public void catalogCategories() {
        for (Category category : categories) {
            System.out.println("Вид товаров = " + category.getName());
            for (Product product : category.products) {
                System.out.println("Товар = " + product.getName() + " " +
                        "Цена = " + product.getPrice() + " " +
                        "Категория = " + product.getRating());
            }
        }
    }
}
