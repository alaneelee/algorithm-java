package Day_19;


import java.util.ArrayList;
import java.util.List;

public class Programmers_94 {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
            if (list.size() == k) {
                return list.stream().mapToInt(Integer::intValue).toArray();
            }
        }

        while(list.size() < k) {
            list.add(-1);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Programmers_94 sol = new Programmers_94();

        int[] arr = {0,1,1,2,2,3};

        System.out.println(sol.solution(arr, 3));
    }
}