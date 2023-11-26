package Day_19;


import java.util.ArrayList;
import java.util.List;

public class Programmers_92 {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    result.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    result.remove(result.size() - 1);
                }
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Programmers_92 sol = new Programmers_92();

        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag = {true, false, true, false, false};

        System.out.println(sol.solution(arr, flag));
    }
}