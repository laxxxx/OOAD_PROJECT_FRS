package FlightReservation;


public class Main {

    //Declaring main function...
    public static void main(String[] args) {

        //Instantiation of Objects of class NormalTicket & TouristTicket...
            NormalTicket regularTicket = new NormalTicket("42069", "Rajahmundry",
                    "Vijayawada", "DepartureDateTime", "ArrivalDateTime",
                    "69F", 6000, false, null, null, "Food");

            TouristTicket touristTicket = new TouristTicket("69420", "USA", "Africa",
                    "DepartureDateTime", "ArrivalDateTIme",
                    "420A", 18000, false, null, null,
                    "NIGGA_HOTEL", new String[]{""});

            printTicketDetails(regularTicket);
            printTicketDetails(touristTicket);
        }
            //method creation which prints the ticket details...
    public static void printTicketDetails(Ticket ticket) {
            System.out.println(ticket.getPnr());
        }

    }


