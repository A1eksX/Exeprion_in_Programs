package HomeWork.HomeWork3;
/*
Создайте иерархию классов для интернет-магазина, как в примере.
Реализуйте методы для обработки покупок и доступа к данным о продуктах.
Добавьте исключения на каждый уровень абстракции для обработки возможных ошибок, например, если товар не найден.****
Дополнительно, вы можете добавить дополнительные уровни абстракции, такие как уровень оплаты и доставки, и реализовать
обработку исключений и на этих уровнях
 */

import HomeWork.HomeWork3.exceptions.notID;
import HomeWork.HomeWork3.exceptions.productAvailability;

import java.util.Scanner;

public class OnlineShopUI {
    public static void main(String[] args) throws productAvailability, notID {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product ID: ");
        int productId = scanner.nextInt();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        try {
            double totalPrice = ShopManager.purchaseProduct(productId, quantity);
            System.out.println("Total price: $" + totalPrice);
        }catch (productAvailability  | notID e){
            System.out.println(e.getMessage());
        }
    }
}