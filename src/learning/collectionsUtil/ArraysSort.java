package learning.collectionsUtil;

import java.util.Arrays;
import java.util.List;

public class ArraysSort {
    public static void main(String[] args) {
        int a[] = {38880,55,454,66};

        System.out.println("Before Sort");
        for (int each:a) {
            System.out.print(each+" ");
        }

        Arrays.sort(a);

        System.out.println();
        System.out.println("After Sort");
        for (int each:a) {
            System.out.print(each+" ");
        }


        System.out.println();
        String[] s = {"V","G","T","F"};
        Arrays.sort(s, new MyComparator());
        for (String element:s) {
            System.out.print(element+ " ");
        }
        int g = Arrays.binarySearch(s,"G");
        System.out.println(g);

        List<String> strings = Arrays.asList(s);
        System.out.println(strings);
    }
}
