package learning.assignment.objectMethods;

public
class ElectricityBill {

    private int    meterNo;
    private String name;
    private String address;

    public
    int getMeterNo ( ) {
        return meterNo;
    }

    public
    void setMeterNo (int meterNo) {
        this.meterNo = meterNo;
    }

    public
    String getName ( ) {
        return name;
    }

    public
    void setName (String name) {
        this.name = name;
    }

    public
    String getAddress ( ) {
        return address;
    }

    public
    void setAddress (String address) {
        this.address = address;
    }


    @Override
    public
    String toString ( ) {
        return "Bill Info " + " Meter Number " + this.meterNo +
               " Name " + this.name + " Address " + this.address;
    }

    @Override
    public
    boolean equals (Object obj) {
        ElectricityBill emp = (ElectricityBill) obj;
        if ( emp.getMeterNo ( ) == this.meterNo) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public
    int hashCode ( ) {
        return meterNo;
    }
}
