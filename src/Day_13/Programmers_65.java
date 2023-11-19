package Day_13;

public class Programmers_65 {
    public int solution(int[] num_list) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                even += num_list[i];
            } else {
                odd += num_list[i];
            }
        }
        return Math.max(odd, even);
    }


    public static void main(String[] args) {
        Programmers_65 sol = new Programmers_65();
        int[] num_list = {4,2,6,1,7,6};
        System.out.println(sol.solution(num_list));
    }
}

