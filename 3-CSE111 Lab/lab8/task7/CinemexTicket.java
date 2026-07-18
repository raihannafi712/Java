package lab8.task7;

public class CinemexTicket extends MovieTicket {
    
    private static int movieTicketCountMain = 0;
    private String movieGenreMain;
    private String movieStatus;
    private String ticketID;

    public CinemexTicket(String movie, String showtime, String movieGenreMain, String date) {

        super(movie, date, showtime, 0.0);
        this.movieGenreMain = movieGenreMain;
        this.movieStatus = "Not Paid";
        super.seat = "Regular";
        movieTicketCountMain++;
        this.ticketID = movie + "-R-" + movieTicketCountMain;
    }

    public CinemexTicket(String movie, String showtime, String movieGenreMain, String date, String seatType) {

        super(movie, date, showtime, 0.0);
        this.movieGenreMain = movieGenreMain;
        this.movieStatus = "Not Paid";
        super.seat = seatType;
        movieTicketCountMain++;
        this.ticketID = movie + "-" + seatType.charAt(0) + "-" + movieTicketCountMain;
    }

    public static int getTotalTickets() {

        return movieTicketCountMain;
    }

    public void calculateTicketPrice() {

        double basePrice = 0.0;
        for (int i = 0; i < seatTypes.length; i++) {

            if (seatTypes[i].equals(super.seat)) {

                basePrice = seatPrices[i];
                break;
            }
        }

        String[] movieTimeCount = super.showtime.split(":");
        int hour = Integer.parseInt(movieTimeCount[0]);

        if (hour >= 18 && hour <= 23) {

            basePrice += basePrice * nightShowCharge / 100.0;
        }

        setPrice(basePrice);
        System.out.println("Ticket price is calculated successfully.");
    }

    public String confirmPayment() {

        if (movieStatus.equals("Paid")) {

            return "Ticket price is already paid!";
        } else {

            movieStatus = "Paid";
            return "Payment Successful.";
        }
    }

    public String toString() {

        return "Ticket ID: " + ticketID + "\n" +
               super.toString() + "\n" +
               "Genre: " + movieGenreMain + "\n" +
               "Seat Type: " + seat + "\n" +
               "Price(tk): " + getPrice() + "\n" +
               "Status: " + status;
    }
}
