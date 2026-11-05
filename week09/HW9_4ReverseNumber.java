package week09;

import java.util.Scanner;

public class HW9_4ReverseNumber {
    public static void main(String[] args) {
        // 9-4 숫자 뒤집기
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자: ");
        int num = sc.nextInt();
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        System.out.println("뒤집은 수: " + reversed);
    }
}
