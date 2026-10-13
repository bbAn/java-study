package week06;

import java.util.Scanner;

public class HW6_5MaxOfThree {
    public static void main(String[] args) {
        // 6-5 세 수 중 가장 큰 수
        Scanner sc = new Scanner(System.in);

        System.out.print("세 수: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println("가장 큰 수: " + max);

        sc.close();
    }
}
