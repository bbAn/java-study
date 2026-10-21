package week08;

import java.util.Scanner;

public class HW8_4Factorial {
    public static void main(String[] args) {
        // 8-4 팩토리얼 — 곱하기 누적
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("음수는 안 됩니다");
            return;
        }

        // int factorial = 1;
        //   13! 부터 int 한계(약 ±21억)를 넘어 오버플로우 — 13! → 1932053504, 20! → -2102132736 (오류 없이 틀린 값)
        //   21! 은 long 한계(약 ±922경)도 넘어서 역시 틀린 값이 나옴
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(n + "! = " + factorial);

        System.out.println();
        System.out.print(n + "! = ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i < n) System.out.print(" × ");
        }
        System.out.println();

        sc.close();
    }
}
