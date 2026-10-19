package week07;

import java.util.Scanner;

public class HW7_1DaysOfMonth {
    public static void main(String[] args) {
        // 7-1 월별 일수
        Scanner sc = new Scanner(System.in);
        System.out.print("연도입력: ");
        int year = sc.nextInt();

        System.out.print("월: ");
        int month = sc.nextInt();

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31일");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30일");
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    System.out.println("29일");
                } else {
                    System.out.println("28일");
                }
                break;
            default:
                System.out.println("잘못된 월입니다");
        }

        sc.close();
    }
}
