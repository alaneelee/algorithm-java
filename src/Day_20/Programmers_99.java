package Day_20;


import java.util.Arrays;

public class Programmers_99 {
    public int[] solution(int[] num_list) {
        int[] answer = {};

        answer = Arrays.stream(num_list).sorted().toArray();

        answer = Arrays.copyOfRange(answer, 0, 5);

        return answer;
    }

    public static void main(String[] args) {
        Programmers_99 sol = new Programmers_99();

        int[] arr = {12, 4, 15, 46, 38, 1, 14};

        System.out.println(sol.solution(arr));
    }
}


//    public int[] solution(int[] num_list) {
//        return Arrays.stream(num_list)
//            .sorted()
//            .limit(5)
//            .toArray();
//    }