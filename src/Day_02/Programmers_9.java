package Day_02;

import java.util.Scanner;

public class Programmers_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.printf("%d is even", n);
        } else {
            System.out.printf("%d is odd", n);
        }

        System.out.print(n + " is " + (n % 2 == 0 ? "even" : "odd"));
    }
}