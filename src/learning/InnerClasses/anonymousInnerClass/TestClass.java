package learning.InnerClasses.anonymousInnerClass;

public
class TestClass {
    public static
    void main (String[] args) {
        Connection con = DriverManager.getConnection ();
        con.createStatement ();
    }
}
