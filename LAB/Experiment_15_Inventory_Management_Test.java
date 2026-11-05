// Inventory Management System - Test Plan Sample
import java.util.*;

class InventoryTest {
    public static void main(String[] args) {
        Map<String, Integer> stock = new HashMap<>();
        stock.put("Keyboard", 20);
        stock.put("Mouse", 5);

        String product = "Keyboard";
        int receivedQuantity = 10;

        if (stock.containsKey(product) && receivedQuantity > 0) {
            stock.put(product, stock.get(product) + receivedQuantity);
            System.out.println("Stock Updated Successfully");
            System.out.println("Available Stock: " + stock.get(product));
        } else {
            System.out.println("Invalid Product or Quantity");
        }
    }
}
