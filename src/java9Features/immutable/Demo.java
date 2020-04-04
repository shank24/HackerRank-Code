package java9Features.immutable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.Map.entry;

public class Demo {

    public static void main(String[] args) {
        List<String> list = List.of("abc", "xyz", "ljk");

        //list.add("nyc");
        Set<String> set = Set.of("abc", "xyz");
        Map<String, String> map = Map.of("f", "sfd", "g", "fdfd");

        map.forEach((k,v) -> System.out.println(k + " - "+v));


        Map<Integer, String> intMap = Map.ofEntries(
                entry(101, "f"),
                entry(102, "s"),
                entry(103, "g"));

        intMap.forEach((k,v)-> System.out.println(k + " - " + v));
    }
}
