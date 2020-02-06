package learning.basic.NonStatic;

public
class Demo {

    static Demo obj;
    static {
        // First it will show null, because here no object creation
        // is happening
        System.out.println (Demo.obj );

        // After this below line, it will create an object, then it
        // will some value
        Demo.obj = new Demo ();

    }
    public static
    void main (String[] args) {

        System.out.println (Demo.obj );

        /*Demo obj = new Demo();
        System.out.println (obj );
        System.out.println (obj.hashCode () );*/
    }
}
