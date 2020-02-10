package learning.interfaces;

public
class Test {
    public static
    void main (String[] args) {
        Car ob = new Honda ();
        ob.go ();
        ob.stop ();

        Honda h = new Honda();
        h.go ();
        h.stop ();
    }
}
