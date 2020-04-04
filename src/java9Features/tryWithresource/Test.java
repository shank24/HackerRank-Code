package java9Features.tryWithresource;

public class Test {
    public static void main(String[] args) {
        MyWorkers myWorkers = new MyWorkers();

        try(myWorkers){
            myWorkers.doSomething();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
