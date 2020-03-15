package java8Features.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterEvenNumbers {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(i);
        }

        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        for (Integer i: list){
            if(i%2==0){
                list1.add(i);
            }
        }

        System.out.println(list1);

        List<Integer> collect = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

        long count = list.stream().filter(i -> i % 2 == 0).count();
        System.out.println(count);

        Comparator<Integer> comp = (i1,i2)->(i1.compareTo(i2));


        List<Integer> collect1 = list.stream().sorted(comp).collect(Collectors.toList());
        System.out.println(collect1);

        Integer max = list.stream().max(comp).get();
        System.out.println(max);
        Integer min = list.stream().min(comp).get();
        System.out.println(min);

        list.stream().forEach(i-> System.out.println(i));


    }
}
