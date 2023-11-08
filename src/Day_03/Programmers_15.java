package Day_03;

public class Programmers_15 {
    public int solution(int a, int b) {
        int answer = 0;

        int answer1 = Integer.parseInt("" + a + b);
        int answer2 = 2 * a * b;

        return Math.max(answer1, answer2);

    }
    public static void main(String[] args) {
        Programmers_15 sol = new Programmers_15();

        System.out.println(sol.solution(89, 8));
    }
}