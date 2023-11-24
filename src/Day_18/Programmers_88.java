package Day_18;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Programmers_88 {
    public int solution(String myString, String pat) {

        List<Character> str = new ArrayList<>();

        for (int i = 0 ; i < myString.length(); i++) {
            if (myString.charAt(i) == 'A') {
                str.add('B');
            } else {
                str.add('A');
            }
        }

        return str.stream().map(String::valueOf).collect(Collectors.joining()).contains(pat) ? 1 : 0;
    }

    public static void main(String[] args) {
        Programmers_88 sol = new Programmers_88();
        String[] strArr = {"and","notad","abcd"};

        System.out.println(sol.solution("ABBAA", "AABB"));
    }
}

// myString = myString.replace("A", "a").replace("B", "A").replace("a", "B");
//        return myString.contains(pat) ? 1 : 0;