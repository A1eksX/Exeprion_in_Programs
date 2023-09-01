package HomeWork.HomeWork3;

import HomeWork.HomeWork3.exceptions.notID;
import HomeWork.HomeWork3.exceptions.productAvailability;

public class ShopManager {
    public static double purchaseProduct(int productId, int quantity) throws productAvailability , notID {

        Product product = ProductDatabase.getProduct(productId);

        if (product != null && quantity > product.getAvailableQuantity()) {
            throw new productAvailability("на складе осталось " + product.getAvailableQuantity() + " шт");
        }
        else {
            double totalPrice = product.getPrice() * quantity;
            return totalPrice;
        }
    }
}









