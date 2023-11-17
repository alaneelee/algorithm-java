package Day_11;

public class Programmers_53 {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start - end_num + 1];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = start - i;
        }

        return answer;
    }


    public static void main(String[] args) {
        Programmers_53 sol = new Programmers_53();
        int[] arr = {1, 16, 6, 15, 0, 10, 11, 3};
        System.out.println(sol.solution(10, 3));
    }
}

