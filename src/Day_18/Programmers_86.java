package Day_18;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Programmers_86 {
    public String[] solution(String myString) {

        String[] arr = Arrays.stream(myString.split("x"))
            .sorted()
            .filter(s -> !s.trim().isEmpty())
            .collect(Collectors.toList())
            .toArray(new String[0]);

        for (String s : arr) {
            System.out.println(s);
        }


        return Arrays.stream(myString.split("x")).sorted().toList().toArray(new String[0]);

    }

    public static void main(String[] args) {
        Programmers_86 sol = new Programmers_86();
        String[] strArr = {"and","notad","abcd"};

        System.out.println(sol.solution("axbxcxdx"));
    }
}

// return Arrays.stream(myString.split("x")).filter(s -> !s.isEmpty()).sorted().toArray(String[]::new);