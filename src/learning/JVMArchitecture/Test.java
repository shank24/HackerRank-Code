package learning.JVMArchitecture;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> user = Class.forName("User");

        Method[] declaredMethods = user.getDeclaredMethods();

        for (Method method:declaredMethods) {
            System.out.println(method.getName());
        }

        System.out.println(declaredMethods.length);
        

    }
}
