package learning.generics;

public class MethodLevelGenerics {
    public <T> void method1(T t){
    }

    public <T extends  Thread> void method2(T t){
    }


    public <T extends  Runnable&Comparable> void method3(T t){
    }

}
