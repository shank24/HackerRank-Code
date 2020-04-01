package learning.reflections;

import learning.annotations.AnnotationTest;

import java.lang.reflect.*;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

        Class<?> aClass = Class.forName(AnnotationTest.class.getName());
        System.out.println(aClass.getName());

        Constructor<?>[] constructors = aClass.getConstructors();

        System.out.println(Arrays.toString(constructors));
        System.out.println(Arrays.toString(aClass.getMethods()));


        Constructor<?> constructor = aClass.getConstructor(null);
        System.out.println(constructor.newInstance(null));

        Object o = constructor.newInstance(null);

        Method method = aClass.getMethod("method", null);
        System.out.println(method.invoke(o,null));

        /*Field numField = aClass.getDeclaredField("num1");
        numField.setAccessible(true);
        numField.set(o,12);
        */

        AnnotatedType[] annotatedInterfaces = aClass.getAnnotatedInterfaces();

        System.out.println(Arrays.toString(annotatedInterfaces));
    }

}
