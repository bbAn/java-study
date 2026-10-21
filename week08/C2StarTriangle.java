package week08;

import java.util.Scanner;

public class C2StarTriangle {
    public static void main(String[] args) {
        // 도전2 별 삼각형
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {   // 공백 n-k 개
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
