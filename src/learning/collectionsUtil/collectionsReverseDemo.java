package learning.collectionsUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectionsReverseDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(4);
        list.add(43);
        System.out.println(list);

        Collections.reverse(list);

        System.out.println(list);
    }
}
