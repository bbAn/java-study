package week09;

import java.util.Scanner;

public class HW9_2DigitSum {
    public static void main(String[] args) {
        // 9-2 자릿수 세기 · 자릿수 합
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자: ");
        int num = sc.nextInt();

        int count = 0;
        int sum = 0;

        // num == 0 체크 없이 돌리면 while 조건이 처음부터 false 라 0자리로 나옴 (틀린 답)
//        while (num > 0) {
//            sum += num % 10;
//            count++;
//            num = num / 10;
//        }
//        System.out.println(count + "자리");
//        System.out.println("자릿수 합 " + sum);

        if (num == 0) {
            System.out.println("1자리");
            System.out.println("자릿수 합 0");
        } else {
            while (num > 0) {
                sum += num % 10;
                count++;
                num = num / 10;
            }
            System.out.println(count + "자리");
            System.out.println("자릿수 합 " + sum);
        }
    }
}
