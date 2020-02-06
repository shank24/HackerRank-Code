package learning.access_Modifier.p1;

public
class A {

    // Non Static Members
    public    int d = 60;
    protected int c = 50;
    int b = 40;
    private int a = 30;

    public static
    void main (String[] args) {

        A obj = new A();
        System.out.println (obj.a );
        System.out.println (obj.b );
        System.out.println (obj.c );
        System.out.println (obj.d );

    }
}
