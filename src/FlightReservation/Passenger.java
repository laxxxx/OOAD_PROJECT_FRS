package FlightReservation;

//passenger class with attributes and methods.....
public class Passenger {

    //attributes...
    private static int passengerCounter = 0;
    private int id;

    //Static Address class....
    private static class Address {

        //attributes for address class....
        String street, city, state;

        //parameterized constructor....
        Address(String street, String city, String state) {
            //this keyword for initialization of variables...
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }
    private Address address;

    //static contact fot storing contact details of passengers....
    private static class Contact {
        //attributes...
        String name, phone, email;

        //parameterized constructor....
        Contact(String name, String phone, String email) {
            //using this keyword for initialization of variables....
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
    }


    private Contact contact;

    //parameterized constructor for main class Passenger....
    public Passenger(String street, String city, String state, String name, String phone, String email) {
        this.id = ++passengerCounter;
        this.address = new Address(street, city, state);
        this.contact = new Contact(name, phone, email);
    }

    //getters..
    public int getId() {
        return this.id;
    }

    //setters...
    public String getAddressDetails() {
        return "Street: " + address.street + ", City: " + address.city + ", State: " + address.state;
    }

    //getters...
    public String getContactDetails() {
        return "Name: " + contact.name + ", Phone: " + contact.phone + ", Email: " + contact.email;
    }

    //static method to return number of passengers...
    public static int getPassengerCount() {
        return passengerCounter;
    }
}


