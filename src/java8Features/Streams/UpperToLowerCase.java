package java8Features.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperToLowerCase {
    public static void main(String[] args) {

        List<String> l1 = new ArrayList<>();

        l1.add("JOHN");
        l1.add("TJO");
        l1.add("TAN");
        l1.add("SHANK");
        l1.add("GAURAV");

        System.out.println(l1);
        List<String> collect = l1.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());

        System.out.println(collect);
    }
}
