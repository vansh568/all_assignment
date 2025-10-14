import java.util.*;

public class lamda_upper{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Amit", "Neha", "Rahul", "Priya");
        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}
