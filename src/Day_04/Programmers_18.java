package Day_04;

public class Programmers_18 {
    public int solution(int n) {
        int answer = 0;
        if (n % 2 == 1) {
            for (int i = 1; i <= n; i+=2) {
                answer += i;
            }
        } else {
            for (int i = 0; i <= n; i+=2) {
                answer += i * i;
            }
        }

//        for(int i = n; i >= 0; i -= 2)
//            answer += (n % 2 == 0) ? i * i : i;
        return answer;
    }
    public static void main(String[] args) {
        Programmers_18 sol = new Programmers_18();

        System.out.println(sol.solution(10));
    }
}