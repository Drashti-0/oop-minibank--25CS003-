class CinemaShow {

    private String title;
    private int seatsAvailable;
    private final int capacity;

    private static int totalBooked = 0;


    // Constructor with title and capacity
    public CinemaShow(String title, int capacity) {
        this.title = title;
        this.capacity = capacity;
        this.seatsAvailable = capacity;
    }


    // Constructor chaining
    public CinemaShow(String title) {
        this(title, 100);
    }


    // Book seats
    public boolean book(int n) {

        if (n <= seatsAvailable) {
            seatsAvailable = seatsAvailable - n;
            totalBooked = totalBooked + n;
            return true;
        }

        return false;
    }


    // Cancel seats
    public void cancel(int n) {

        seatsAvailable = seatsAvailable + n;

        // seats cannot exceed capacity
        if (seatsAvailable > capacity) {
            seatsAvailable = capacity;
        }
    }


    // Get available seats
    public int getSeatsAvailable() {
        return seatsAvailable;
    }


    // Get total booked seats
    public static int getTotalBooked() {
        return totalBooked;
    }


    // Main method
    public static void main(String[] args) {


        CinemaShow movie = new CinemaShow("Avengers", 50);


        System.out.println("Initial Seats: " + movie.getSeatsAvailable());


        System.out.println("Book 20 seats: " + movie.book(20));
        System.out.println("Seats Available: " + movie.getSeatsAvailable());


        System.out.println("Book 40 seats: " + movie.book(40));
        System.out.println("Seats Available: " + movie.getSeatsAvailable());


        movie.cancel(10);
        System.out.println("After cancelling 10 seats:");
        System.out.println("Seats Available: " + movie.getSeatsAvailable());


        System.out.println("Book 30 seats: " + movie.book(30));
        System.out.println("Seats Available: " + movie.getSeatsAvailable());


        System.out.println("Total Booked Seats: " + CinemaShow.getTotalBooked());

    }
}