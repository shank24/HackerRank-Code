package learning.generics;

public class Test {
    public static void main(String[] args) {
        MyGenericClass<String> s = new MyGenericClass<>("Cherry");
        s.displayObjectDetails();
        System.out.println(s.getObject());


        MyGenericClass<Integer> i = new MyGenericClass<>(123);
        i.displayObjectDetails();
        System.out.println(i.getObject());

    }
}
