package Day_05;

public class Programmers_23 {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int cnt = 0;
        if (a == b) {
            cnt += 1;
        }
        if (a == c) {
            cnt += 1;
        }
        if (b == c) {
            cnt += 1;
        }

        switch(cnt) {
            case 0:
                answer = a+b+c;
                break;
            case 1:
                answer = (a+b+c) * (a*a+b*b+c*c);
                break;
            default:
                answer = (a+b+c) * (a*a+b*b+c*c) * (a*a*a+b*b*b+c*c*c);
                break;
        }

        return answer;
    }

    public static void main(String[] args) {
        Programmers_23 sol = new Programmers_23();

        System.out.println(sol.solution(4,4,4));
    }
}



//    public int solution(int a, int b, int c) {
//        int answer = 1;
//
//        int count = 1;
//        if(a == b || a == c || b == c) {
//            count++;
//        }
//
//        if(a == b && b == c) {
//            count++;
//        }
//
//        for(int i = 1; i <= count; i++) {
//            answer *= (pow(a,i)+pow(b,i)+pow(c,i));
//        }
//
//        return answer;
//    }
//
//    private int pow(int a, int b) {
//        if(b == 0) return 1;
//        return a * pow(a, b-1);
//    }