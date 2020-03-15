package java8Features.lambdas.additon;

public class Test {
    public static void main(String[] args) {
        Sum s=(x,y)-> System.out.println("Sum is :" + (x+y) );
        s.add(21,41);
    }
}
