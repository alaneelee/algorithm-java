package Day_14;

import java.util.ArrayList;
import java.util.List;

public class Programmers_67 {
    public String[] solution(String[] todo_list, boolean[] finished) {

        List<String> answer = new ArrayList<>();

        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                answer.add(todo_list[i]);
            }
        }


        return answer.toArray(new String[0]);
    }


    public static void main(String[] args) {
        Programmers_67 sol = new Programmers_67();
        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished = {true, false, true, false};
        System.out.println(sol.solution(todo_list, finished));
    }
}

