package Day_03;

public class Programmers_13 {
    public String solution(String my_string, int k) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < k; i++) {
            answer.append(my_string);
        }

        return answer.toString();

        // return my_string.repeat(k);
    }
    public static void main(String[] args) {
        Programmers_13 sol = new Programmers_13();

        System.out.println(sol.solution("string", 3));
    }
}