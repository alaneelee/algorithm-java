package Day_08;

public class Programmers_37 {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        for (int i : index_list) {
            answer += my_string.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Programmers_37 sol = new Programmers_37();
        int[] arr = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};

        System.out.println(sol.solution("cvsgiorszzzmrpaqpe",arr));
    }
}


