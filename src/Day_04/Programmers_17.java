package Day_04;

public class Programmers_17 {
    public int solution(int number, int n, int m) {
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }
    public static void main(String[] args) {
        Programmers_17 sol = new Programmers_17();

        System.out.println(sol.solution(60,2,3));
    }
}