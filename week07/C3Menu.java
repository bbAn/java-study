package week07;

import java.util.Scanner;

public class C3Menu {
    public static void main(String[] args) {
        // 도전3 메뉴
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 입력  2. 조회  3. 삭제  0. 종료");
        System.out.print("선택: ");

        if (!sc.hasNextInt()) {
            System.out.println("잘못된 입력입니다");
            return;
        }
        int menu = sc.nextInt();

        String selectMenu = switch (menu) {
            case 1 -> "입력을";
            case 2 -> "조회를";
            case 3 -> "삭제를";
            case 0 -> "종료를";
            default -> "등록되지 않은 메뉴를";
        };
        System.out.println(selectMenu + " 선택했습니다");

        sc.close();
    }
}
