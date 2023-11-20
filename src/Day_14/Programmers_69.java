package Day_14;

import java.util.ArrayList;
import java.util.List;

public class Programmers_69 {
    public int[] solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                arr[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                arr[i] = arr[i] * 2;
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        Programmers_69 sol = new Programmers_69();
        int[] arr = {1, 2, 3, 100, 99, 98};
        System.out.println(sol.solution(arr));
    }
}

