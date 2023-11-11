package Day_06;

public class Programmers_27 {
    public int solution(int n, String control) {
        int answer = n;
        for (char c : control.toCharArray()) {
            switch(c) {
                case 'w':
                    answer += 1;
                    break;
                case 's':
                    answer -= 1;
                    break;
                case 'd':
                    answer += 10;
                    break;
                case 'a':
                    answer -= 10;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Programmers_27 sol = new Programmers_27();


        System.out.println(sol.solution(0,"wsdawsdassw"));
    }
}