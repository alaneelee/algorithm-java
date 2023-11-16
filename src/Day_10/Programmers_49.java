package Day_10;

public class Programmers_49 {
    public String solution(int q, int r, String code) {
        String answer = "";

        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) {
                answer += code.charAt(i);
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Programmers_49 sol = new Programmers_49();
        System.out.println(sol.solution(3, 1, "qjnwezgrpirldywt"));
    }
}

