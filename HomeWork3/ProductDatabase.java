package HomeWork.HomeWork3;

import HomeWork.HomeWork3.exceptions.notID;

import java.util.ArrayList;
import java.util.List;

public class ProductDatabase {

    public static List<Product> products() {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Product 1", 10, 5.99, 1));
        products.add(new Product("Product 2", 20, 3.99, 2));
        products.add(new Product("Product 3", 15, 8.99, 3));
        return products;
    }

    public static Product getProduct(int productId) throws notID  {
        // Подразумевается обращение к базе данных или хранилищу товаров
        // и получение информации о товаре по его ID
        // В данном примере мы используем заглушку
        if (productId > products().size()) throw new notID ("Товара с id " + productId + " не существует");

        for (Product item : products() ) {
            if (item.getId() == productId) {
                return item;
            }
        }
        return null;
    }
}