package Day_04;

public class Programmers_16 {
    public int solution(int num, int n) {
        return num % n == 0 ? 1 : 0;
    }
    public static void main(String[] args) {
        Programmers_16 sol = new Programmers_16();

        System.out.println(sol.solution(98, 2));
    }
}