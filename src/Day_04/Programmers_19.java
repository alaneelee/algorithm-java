package Day_04;

public class Programmers_19 {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = switch (ineq + eq) {
            case ">=" -> n >= m ? 1 : 0;
            case "<=" -> n <= m ? 1 : 0;
            case ">!" -> n > m ? 1 : 0;
            case "<!" -> n < m ? 1 : 0;
            default -> 0;
        };
        return answer;
    }
    public static void main(String[] args) {
        Programmers_19 sol = new Programmers_19();

        System.out.println(sol.solution("<","=",20,50));
    }
}