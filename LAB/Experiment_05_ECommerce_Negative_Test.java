// E-Commerce - Negative Test Case
class EcommerceNegativeTest {
    public static void main(String[] args) {
        boolean productAvailable = false;
        int cartSize = 0;

        if (!productAvailable)
            System.out.println("Product is Out of Stock");
        if (cartSize == 0)
            System.out.println("Checkout Not Allowed - Cart is Empty");
    }
}
