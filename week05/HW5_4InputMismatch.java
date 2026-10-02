package week05;

import java.util.Scanner;

public class HW5_4InputMismatch {
    public static void main(String[] args) {
        // 5-4 숫자 칸에 글자를 넣으면
        Scanner sc = new Scanner(System.in);
        System.out.print("나이 입력: ");
        int age = sc.nextInt();
        System.out.println("나이: " + age);

        sc.close();
    }
}
