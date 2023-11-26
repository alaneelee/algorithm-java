package Day_19;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers_91 {
    public int[] solution(int[] arr) {
        int len = Arrays.stream(arr).sum();
        int[] answer = new int[len];

        List<Integer> result = new ArrayList<>();
        for (int i : arr) {
            for (int j = 0; j < i; j++) {
                result.add(i);
            }
        }

        answer = result.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }

    public static void main(String[] args) {
        Programmers_91 sol = new Programmers_91();

        int[] arr = {5,1,4};

        System.out.println(sol.solution(arr));
    }
}