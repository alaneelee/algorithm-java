package Day_20;


import java.util.Arrays;

public class Programmers_100 {
    public int[] solution(int[] num_list) {
        int[] answer = Arrays.stream(num_list).sorted().toArray();;
        answer = Arrays.copyOfRange(answer, 5, answer.length);

        return answer;
    }

    public static void main(String[] args) {
        Programmers_100 sol = new Programmers_100();

        int[] arr = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};

        System.out.println(sol.solution(arr));
    }
}

//class Solution {
//    public int[] solution(int[] numList) {
//        return Arrays.stream(numList).sorted().skip(5).toArray();
//    }
//}
