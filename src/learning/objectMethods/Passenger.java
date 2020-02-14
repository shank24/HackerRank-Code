package learning.objectMethods;

public
class Passenger {



    private int id;

    private String firstName;

    public
    int getId ( ) {
        return id;
    }

    public
    void setId (int id) {
        this.id = id;
    }

    private String lastName;

    public
    String getFirstName ( ) {
        return firstName;
    }

    public
    void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public
    String getLastName ( ) {
        return lastName;
    }

    public
    void setLastName (String lastName) {
        this.lastName = lastName;
    }


    @Override
    public
    String toString ( ) {
        return "Passenger Information is First Name :" + this.firstName +
               " Last Name is :" + this.lastName;
    }

    @Override
    public
    int hashCode ( ) {
        return id+firstName.length ()+lastName.length ();
    }

    @Override
    public
    boolean equals (Object obj) {
        Passenger passenger = (Passenger)obj;

        if(passenger.getId ()==this.id
           && passenger.getFirstName ().equals ( this.firstName )
           && passenger.getLastName ().equals ( this.lastName ))
            return true;
        else
            return false;
    }
}
