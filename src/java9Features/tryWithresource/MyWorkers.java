package java9Features.tryWithresource;

public class MyWorkers implements AutoCloseable {


    MyWorkers(){
        System.out.println("Creating the resource");
    }

    public void doSomething(){
        System.out.println("Doing Something");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing the resource");
    }
}
