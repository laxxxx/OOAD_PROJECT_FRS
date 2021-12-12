package FlightReservation;
import java.time.LocalDateTime;

    ////Using extends keywords since this class inherits from Ticket...
    public class TouristTicket extends Ticket {

        //attributes...
        private String hotelAddress;
        private String[] selectedTouristLocation;

        //Parametrized constructor...
        public TouristTicket(String pnr, String from, String to, String departureDateTime,
                             String arrivalDateTime, String seatNo, float price, boolean cancelled,
                             NormalFlight flight, Passenger passenger, String hotelAddress,
                             String[] selectedTouristLocation) {

            //using super keyword because we are using parent class attributes....
            super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, price, cancelled, flight, passenger);
            //using this keyword to initialize the attributes...
            this.hotelAddress = hotelAddress;
            this.selectedTouristLocation = selectedTouristLocation;
        }

        //getters....
        public String getHotelAddress() {
            return hotelAddress;
        }

        //setters....
        public void setHotelAddress(String hotelAddress) {
            this.hotelAddress = hotelAddress;
        }

        //getters....
        public String[] getSelectedTouristLocation() {
            return selectedTouristLocation;
        }

        //setters....
        public void setSelectedTouristLocation(String[] selectedTouristLocation) {
            this.selectedTouristLocation = selectedTouristLocation;
        }
    }











