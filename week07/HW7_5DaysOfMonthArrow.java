package week07;

import java.util.Scanner;

public class HW7_5DaysOfMonthArrow {
    public static void main(String[] args) {
        // 7-5 새 문법 -> 로 바꾸기
        Scanner sc = new Scanner(System.in);
        System.out.print("월: ");
        int month = sc.nextInt();

        int days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> 0;
        };

        if (days == 0) {
            System.out.println("잘못된 월입니다");
        } else {
            System.out.println(days + "일");
        }

        sc.close();
    }
}
