package java9Features.streamingAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class StreamingAPIDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 23, 45, 66, 77,85, 80,null );
        //List<Integer> collect = list.stream().filter(x -> x % 5 == 0).collect(toList());
        //System.out.println(collect);

        List<Integer> collect1 = list.stream().takeWhile(x -> x % 5 == 0).collect(toList());

        System.out.println(collect1);

        List<Integer> collect2 = list.stream().dropWhile(x -> x % 5 == 0).collect(toList());

        System.out.println(collect2);

        List<Integer> collect3 = list.stream().flatMap(x -> Stream.ofNullable(x)).collect(toList());
        System.out.println(collect3);
    }

}
