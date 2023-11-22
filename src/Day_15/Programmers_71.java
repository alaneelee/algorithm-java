package Day_15;

import java.util.Arrays;

public class Programmers_71 {
    public int solution(int[] arr) {
        int answer = 0;
        while (true) {
            int[] temp = Arrays.copyOf(arr, arr.length);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            if (Arrays.equals(temp, arr)) {
                return answer;
            }
            answer++;
        }
    }

    public static void main(String[] args) {
        Programmers_71 sol = new Programmers_71();
        int[] arr = {1, 2, 3, 100, 99, 98};
        System.out.println(sol.solution(arr));
    }
}

