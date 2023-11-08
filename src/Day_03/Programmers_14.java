package Day_03;

public class Programmers_14 {
    public int solution(int a, int b) {
        String answer1 = "" + a + b;
        String answer2 = "" + b + a;

        int answer = Integer.parseInt(answer1) > Integer.parseInt(answer2) ? Integer.parseInt(answer1) : Integer.parseInt(answer2);

//        int aLong = Integer.parseInt(""+a+b);
//        int bLong = Integer.parseInt(""+b+a);
//        answer = aLong > bLong ? aLong : bLong;
//
//        return answer;

        return answer;
    }
    public static void main(String[] args) {
        Programmers_14 sol = new Programmers_14();

        System.out.println(sol.solution(89, 8));
    }
}