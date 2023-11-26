package Day_19;


import java.util.ArrayList;
import java.util.List;

public class Programmers_93 {
    public int[] solution(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        while(i < arr.length) {
            if (result.isEmpty()) {
                result.add(arr[i]);
            } else {
                if (result.get(result.size() - 1) == arr[i]) {
                    result.remove(result.size() - 1);
                } else {
                    result.add(arr[i]);
                }
            }
            i++;
        }

        if (result.isEmpty()) {
            result.add(-1);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Programmers_93 sol = new Programmers_93();

        int[] arr = {0,1,1,1,0};
        boolean[] flag = {true, false, true, false, false};

        System.out.println(sol.solution(arr));
    }
}