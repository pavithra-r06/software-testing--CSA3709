// Food Delivery - Positive Test Case
class FoodDeliveryPositiveTest {
    public static void main(String[] args) {
        String restaurant = "ABC Restaurant";
        String food = "Veg Biryani";
        String address = "Chennai";
        int price = 180;

        if (!restaurant.isEmpty() && !food.isEmpty() && !address.isEmpty()) {
            System.out.println("Restaurant: " + restaurant);
            System.out.println("Food Added: " + food);
            System.out.println("Amount: " + price);
            System.out.println("Order Placed Successfully");
        }
    }
}
