// Food Delivery - Negative Test Case
class FoodDeliveryNegativeTest {
    public static void main(String[] args) {
        boolean foodAvailable = false;
        String address = "";

        if (!foodAvailable)
            System.out.println("Food Item is Unavailable");
        else if (address.isEmpty())
            System.out.println("Delivery Address is Required");
        else
            System.out.println("Order Placed");
    }
}
