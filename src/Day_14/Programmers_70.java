package Day_14;

public class Programmers_70 {
    public int[] solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                arr[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                arr[i] = arr[i] * 2;
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        Programmers_70 sol = new Programmers_70();
        int[] arr = {1, 2, 3, 100, 99, 98};
        System.out.println(sol.solution(arr));
    }
}

