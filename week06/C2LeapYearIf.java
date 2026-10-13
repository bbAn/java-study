package week06;

import java.util.Scanner;

public class C2LeapYearIf {
    public static void main(String[] args) {
        // 도전2 윤년을 if 로
        Scanner sc = new Scanner(System.in);
        System.out.print("연도입력: ");
        int year = sc.nextInt();

        boolean isLeapYear;
        boolean isLeapYearOneLiner = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        // 4 → 100 → 400 으로 바꿔서 실행
        //if (year % 4 == 0) {
        //isLeapYear = true;
        //} else if (year % 100 == 0) {
        //isLeapYear = false;
        //} else if (year % 400 == 0) {
        //isLeapYear = true;
        //} else {
        //isLeapYear = false;
        //}

        if (year % 400 == 0) {
            isLeapYear = true;
        } else if (year % 100 == 0) {
            isLeapYear = false;
        } else if (year % 4 == 0) {
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }

        System.out.println(year + "년 " + (isLeapYear ? "윤년 O" : "윤년 아님 X"));
        //System.out.println(year + "년 한줄식: " + (isLeapYearOneLiner ? "윤년 O" : "윤년 아님 X"));

        sc.close();

    }
}
