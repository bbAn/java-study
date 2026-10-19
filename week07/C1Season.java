package week07;

import java.util.Scanner;

public class C1Season {
    public static void main(String[] args) {
        // 도전1 계절
        Scanner sc = new Scanner(System.in);
        System.out.print("월: ");
        int month = sc.nextInt();

        String season = switch (month) {
            case 12, 1, 2 -> "겨울";
            case 3, 4, 5 -> "봄";
            case 6, 7, 8 -> "여름";
            case 9, 10, 11 -> "가을";
            default -> "잘못된 월입니다";
        };

        System.out.println(season);
        sc.close();
    }
}
