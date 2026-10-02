package week05;

import java.util.Scanner;

public class HW5_5TimeConverterInput {
    public static void main(String[] args) {
        // 5-5 ① 3주차 초를 시·분·초로 — 초를 입력받게 고치기
        Scanner sc = new Scanner(System.in);
        System.out.print("초 입력: ");
        // int total = 3725;

        int total = sc.nextInt();
        int hour = total / 3600; // 60분 * 60초
        int remainder = total % 3600;
        int minute = remainder / 60;
        int second = remainder % 60;

        System.out.println(hour + "시간 " + minute + "분 " + second + "초" );

        sc.close();
    }
}
