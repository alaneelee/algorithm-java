package Day_17;

import java.util.ArrayList;
import java.util.List;

public class Programmers_83 {
    public String[] solution(String my_string) {
        return my_string.split(" ");
    }

    public static void main(String[] args) {
        Programmers_83 sol = new Programmers_83();
        String[] strArr = {"and","notad","abcd"};

        System.out.println(sol.solution("i love you"));
    }
}