package Day_08;

public class Programmers_38 {
    public int solution(String number) {
        int answer = 0;
        for (char c : number.toCharArray()) {
            answer += (int) c - 48;
        }

        return answer % 9;
    }


    public static void main(String[] args) {
        Programmers_38 sol = new Programmers_38();

        System.out.println(sol.solution("78720646226947352489"));
    }
}


