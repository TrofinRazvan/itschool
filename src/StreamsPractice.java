import java.util.*;
import java.util.stream.Collectors;

public class StreamsPractice {

    public static void main(String[] args) {
        //operatii intermediale
//        filter();
//        map();//intermediate operation
//        flatMap();
//        distinct();
//        sort();

        //operatii terminale
//        forEach();
//        reduce();
//        count();
//        anyMatch();
//        collect();
//        filterMapCollect();
//        flatmapDistinct();
        filterSortForEach();
    }

    static void filterSortForEach() {
        List<User> userList = Arrays.asList(
                new User("Alice", 23),
                new User("Bob", 34),
                new User("Gica", 54));
        userList.stream()
                .filter(user -> user.getAge() > 30)
                .sorted(Comparator.comparing(User::getName))
                .forEach(user -> System.out.println(user.getName()));
    }

    static void flatmapDistinct() {
        List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(2, 3, 4), Arrays.asList(5, 6, 1));
        long count = numbers.stream()
                .flatMap(Collection::stream)
                .distinct()
                .count();
        System.out.println(count);

    }

    static void filterMapCollect() {
        List<String> names = Arrays.asList("Gica", "ANA", "Iorcache", "Anastasia", "Razvan");
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(filteredNames);

    }

    static void collect() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> sqauredNumbers = numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());
        System.out.println(sqauredNumbers);

    }

    static void anyMatch() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        boolean hasEvenNumbers = numbers.stream()
                .anyMatch(number -> number % 2 == 0);
        System.out.println(hasEvenNumbers);

    }

    static void count() {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        long count = numbers.stream().count();
        System.out.println(count);
    }

    static void reduce() {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b); // terminal operation
        int multiply = numbers.stream()
                .reduce(1, (a, b) -> a * b); // terminal operation
        System.out.println(sum + " " + multiply);
    }

    static void forEach() {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.stream()
                .forEach(System.out::println);
    }

    static void sort() {
        List<String> words = Arrays.asList("hei", "you", "bombastik", "buna", "razvan");
        List<String> sortedWords = words.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
        System.out.println(sortedWords);
    }

    static void distinct() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()//intermediate operation
                .collect(Collectors.toList());
        ;
        System.out.println(distinctNumbers);

    }
    //transform each element of a stream into zero or more elements using a function

    static void flatMap() {
        List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1, 2, 9), Arrays.asList(3, 4), Arrays.asList(5, 6));
        List<Integer> flatNumbers = numbers.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
        System.out.println("Flatted numbers: " + flatNumbers);

        List<Integer> extractedNumbers = new ArrayList<>();
        for (List<Integer> numberList : numbers) {
            for (Integer number : numberList) {
                extractedNumbers.add(number);
            }
        }

        numbers.forEach(numberList -> numberList.forEach(number -> extractedNumbers.add(number)));
        System.out.println("Extracted numbers: " + extractedNumbers);
    }

    // transform each element of a stream using a function
    static void map() {
        List<String> word = Arrays.asList("hei", "you", "yes", "buna");
        List<Integer> wordLengths = word.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(wordLengths);
    }

    static void filter() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);
    }
}
