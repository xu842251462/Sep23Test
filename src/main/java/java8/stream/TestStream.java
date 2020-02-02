package java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

public class TestStream {


    public static void main(String a[]) {

        List<String> vechicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");

        vechicles.stream().filter(str->str.length() > 3).map(String::toUpperCase).sorted().forEach(System.out::println);

        ;

        vechicles.stream().map(String::toLowerCase).forEach(System.out::println);
        vechicles.stream()
                .sorted((Comparator<? super String>) vechicles)
                .forEach(System.out::println);

        Stream<UUID> uuidStream = Stream.generate(UUID::randomUUID);
        uuidStream.limit(10).forEach(System.out::println);
    }
}
