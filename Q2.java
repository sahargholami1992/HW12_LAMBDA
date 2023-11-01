import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Q2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter length of array");
            int length = scanner.nextInt();
            // {"Amir", "Hatef", "Mahdi", "Mojtaba", "Mohammad", "Ali", "Taher", "Reza", "Mohsen"};
            String[] words = new String[length];
            for (int i = 0; i < length; i++) {
                words[i] = scanner.next();
            }

            Map<String, Integer> sortedByLength = Arrays.stream(words)
                    .filter(Objects::nonNull)
                    .distinct()
                    .collect(Collectors.toMap(Function.identity(), String::length));

            System.out.println("************************** WORD BY LENGTH *******************");
            System.out.println(sortedByLength);

            Map<Integer, List<String>> groupedMap = Arrays.stream(words).collect(Collectors.groupingBy(String::length));
            System.out.println("************************** GROUPING BY LENGTH OF WORD *******************");

            System.out.println(groupedMap);
        }
    }



