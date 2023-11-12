package Day_07;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Programmers_33 {
    public int[] solution(int n) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(n);
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = (n * 3) + 1;
            }
            nums.add(n);
        }

        int[] answer = nums.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    public static void main(String[] args) {
        Programmers_33 sol = new Programmers_33();
        System.out.println(sol.solution(10));
    }
}



//import java.util.stream.IntStream;
//
//class Solution {
//    public int[] solution(int n) {
//        return IntStream.concat(
//                IntStream.iterate(n, i -> i > 1, i -> i % 2 == 0 ? i / 2 : i * 3 + 1),
//                IntStream.of(1))
//            .toArray();
//    }
//}