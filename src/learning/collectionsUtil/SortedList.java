package learning.collectionsUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("l");
        list.add("A");
        list.add("b");
        list.add("H");
        list.add("r");

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

    }
}
