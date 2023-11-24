package Day_18;


import java.util.ArrayList;
import java.util.List;

public class Programmers_90 {
    public String[] solution(String myStr) {
        List<String> result = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        for (char c : myStr.toCharArray()) {
            if (c == 'a' || c == 'b' || c == 'c') {
                if (sb.length() > 0) {
                    result.add(sb.toString());
                    sb = new StringBuilder();
                }
            } else {
                sb.append(c);
            }
        }

        if (sb.length() > 0) {
            result.add(sb.toString());
        }
        return result.isEmpty() ? new String[]{"EMPTY"} : result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Programmers_90 sol = new Programmers_90();

        System.out.println(sol.solution("baconlettucetomato"));
    }
}