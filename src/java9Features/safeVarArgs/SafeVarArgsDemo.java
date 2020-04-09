/*
package java9Features.safeVarArgs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SafeVarArgsDemo {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        arrayList.add("abc");
        arrayList.add("xyz");

        List<String> arrayList1 = new ArrayList<>();
        arrayList.add("abcd");
        arrayList.add("xyzf");


        //SafeVarArgs.myMethod(arrayList,arrayList1);
        SafeVarArgsDemo safeVarargs = new SafeVarArgsDemo();
        safeVarargs.myMethod(arrayList,arrayList1);
    }

    @SafeVarargs
    private void myMethod(List<String>...l){ //   List<String> []
        */
/*Object[] objects =l;
        objects[0] = Arrays.asList(1,2);
*//*

        String name =(String)l[0].get(0);
        System.out.println(name);

    }
}
*/
