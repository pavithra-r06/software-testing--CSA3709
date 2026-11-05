// Railway Reservation System - Negative Test Case
class RailwayNegativeTest {
    public static void main(String[] args) {
        int availableSeats = 0;
        int requestedSeats = 2;

        if (requestedSeats <= 0) {
            System.out.println("Invalid Passenger Count");
        } else if (requestedSeats > availableSeats) {
            System.out.println("Booking Rejected - No Seats Available");
        } else {
            System.out.println("Booking Successful");
        }
    }
}
