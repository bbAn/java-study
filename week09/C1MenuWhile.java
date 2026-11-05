package week09;

import java.util.Scanner;

public class C1MenuWhile {
    public static void main(String[] args) {
        // 도전1 메뉴 — 진짜 "0 누를 때까지"
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. 입력  2. 조회  3. 삭제  0. 종료");
            System.out.print("선택: ");
            if (!sc.hasNextInt()) {
                sc.next();
                System.out.println("잘못된 입력입니다");
            } else {
                int menu = sc.nextInt();
                if (menu == 0) break;
                String selectMenu = switch (menu) {
                    case 1 -> "입력을";
                    case 2 -> "조회를";
                    case 3 -> "삭제를";
                    default -> "등록되지 않은 메뉴를";
                };
                System.out.println(selectMenu + " 선택했습니다");
            }
        }

        // do-while, break 없이 } while (menu != 0); 로 시도
        // abc 를 넣으면 hasNextInt() 분기에서 menu 에 대입할 값이 없어서
        // "variable menu might not have been initialized" 컴파일 에러 발생
//        int menu;
//        do {
//            System.out.println("1. 입력  2. 조회  3. 삭제  0. 종료");
//            System.out.print("선택: ");
//            if (!sc.hasNextInt()) {
//                sc.next();
//                System.out.println("잘못된 입력입니다");
//            } else {
//                menu = sc.nextInt();
//                String selectMenu = switch (menu) {
//                    case 1 -> "입력을";
//                    case 2 -> "조회를";
//                    case 3 -> "삭제를";
//                    case 0 -> "종료를";
//                    default -> "등록되지 않은 메뉴를";
//                };
//                System.out.println(selectMenu + " 선택했습니다");
//            }
//        } while (menu != 0);

        System.out.println("종료합니다");
        sc.close();
    }
}
