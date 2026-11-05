// Railway Reservation System - Positive Test Case
class RailwayPositiveTest {
    public static void main(String[] args) {
        String source = "Chennai";
        String destination = "Bengaluru";
        int availableSeats = 25;
        int passengers = 2;

        if (!source.equals(destination) && passengers > 0
                && passengers <= availableSeats) {
            availableSeats -= passengers;
            System.out.println("Train Search Successful");
            System.out.println("Tickets Booked: " + passengers);
            System.out.println("Remaining Seats: " + availableSeats);
        } else {
            System.out.println("Booking Failed");
        }
    }
}
