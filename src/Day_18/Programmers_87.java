package Day_18;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class Programmers_87 {
    public int solution(String binomial) {
        String[] sp = binomial.split(" ");
        int a = Integer.parseInt(sp[0]);
        String op = sp[1];
        int b = Integer.parseInt(sp[2]);

        return Objects.equals(op, "+") ? a + b : Objects.equals(op, "-") ? a - b : a * b;
    }

    public static void main(String[] args) {
        Programmers_87 sol = new Programmers_87();
        String[] strArr = {"and","notad","abcd"};

        System.out.println(sol.solution("43 + 12"));
    }
}

// return Arrays.stream(myString.split("x")).filter(s -> !s.isEmpty()).sorted().toArray(String[]::new);