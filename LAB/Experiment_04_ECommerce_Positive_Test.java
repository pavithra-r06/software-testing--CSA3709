// E-Commerce - Positive Test Case
import java.util.*;

class EcommercePositiveTest {
    public static void main(String[] args) {
        ArrayList<String> cart = new ArrayList<>();
        String product = "Laptop";
        int price = 55000;

        cart.add(product);
        if (cart.contains(product)) {
            System.out.println(product + " added to cart");
            System.out.println("Price: " + price);
            System.out.println("Proceed to Checkout");
        }
    }
}
