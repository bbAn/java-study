package week05;

import java.util.Scanner;

public class C1LeapYearInput {
    public static void main(String[] args) {
        // 도전1 윤년 다시 — 4주차 도전2 를 year 입력받게 고치기
        Scanner sc = new Scanner(System.in);
        System.out.print("연도입력: ");
        int year = sc.nextInt();

        sc.close();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        System.out.println(year + "년 " + (isLeapYear ? "윤년 O":"윤년 아님 X"));
    }
}
