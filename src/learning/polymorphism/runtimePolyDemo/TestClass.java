package learning.polymorphism.runtimePolyDemo;

public
class TestClass {
    public static
    void main (String[] args) {

        // This is upcasting which happens implicitly like
        // (Widening in Primitives)

        AppleLaptop mair = new MacbookAir ();
        mair.start ();
        mair.shutdown ();

        // For downcasting, we have to do explicitly
        // Like below.
        MacbookAir m3 = (MacbookAir) mair;

        // The main advantage of downcasting is to invoke specific behaviour
        // of Child class which is not present in Parent Class.

        AppleLaptop mpro = new MacbookPro ();
        mpro.start ();
        mpro.shutdown ();


        MacbookPro m4 = (MacbookPro) mpro;
    // These below method are synonomous to each other.
        m4.prosMethod ();
        ((MacbookPro) mpro).prosMethod ();

    }
}
