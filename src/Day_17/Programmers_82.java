package Day_17;

import java.util.ArrayList;
import java.util.List;

public class Programmers_82 {
    public String[] solution(String[] strArr) {
        List<String> answer = new ArrayList<>();

        for (String s : strArr) {
            if (!s.contains("ad")) {
                answer.add(s);
            }
        }

        return answer.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Programmers_82 sol = new Programmers_82();
        String[] strArr = {"and","notad","abcd"};

        System.out.println(sol.solution(strArr));
    }
}