package Homeworks.Homework_1;

public class Main {
    public static void main(String[] args) {
        Product mushroom = new Product("грибы", 15.00, "1");
        Product pig = new Product("свинина", 21.00, "3");
        Product banana = new Product("банан", 10.50, "1");
        Product potato = new Product("картошка", 18.00, "2");
        Product mango = new Product("манго", 8.60, "2");
        Product chicken = new Product("курица", 25.00, "1");

        Category vegetables = new Category("овощи");
        Category meat = new Category("мясо");
        Category fruits = new Category("фрукты");

        Shop shop = new Shop();

        vegetables.addProduct(mushroom);
        vegetables.addProduct(potato);
        meat.addProduct(pig);
        meat.addProduct(chicken);
        fruits.addProduct(banana);
        fruits.addProduct(mango);

        shop.addCategory(vegetables);
        shop.addCategory(meat);
        shop.addCategory(fruits);

        shop.catalogCategories();
        System.out.println();
        User user1 = new User("buyer1", "qwerty123456");

        user1.basket.addBuyProduct(vegetables.getProduct().get(0));
        vegetables.getProduct().remove(0);
        user1.basket.addBuyProduct(meat.getProduct().get(1));
        meat.getProduct().remove(1);

        User user2 = new User("buyer2", "qwerty123");
        user1.basket.addBuyProduct(vegetables.getProduct().get(0));
        vegetables.getProduct().remove(0);
        user1.basket.addBuyProduct(fruits.getProduct().get(0));
        fruits.getProduct().remove(0);


        System.out.println();
        user1.basket.showBasket();
        System.out.println();
        user2.basket.showBasket();

        System.out.println();
        shop.catalogCategories();

    }
}
