package week07;

import java.util.Scanner;

public class C1Season {
    public static void main(String[] args) {
        // 도전1 계절
        Scanner sc = new Scanner(System.in);
        System.out.print("월: ");
        int month = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("잘못된 월입니다");
            return;
        }

        String season = switch (month) {
            case 12, 1, 2 -> "겨울";
            case 3, 4, 5 -> "봄";
            case 6, 7, 8 -> "여름";
            default -> "가을";
        };

        System.out.println(season);
    }
}
