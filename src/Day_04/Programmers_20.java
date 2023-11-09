package Day_04;

public class Programmers_20 {
    public int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }
    public static void main(String[] args) {
        Programmers_20 sol = new Programmers_20();

        System.out.println(sol.solution(-4,7,true));
    }
}