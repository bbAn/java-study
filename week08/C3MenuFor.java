package week08;

import java.util.Scanner;

public class C3MenuFor {
    public static void main(String[] args) {
        // 도전3 메뉴 — for 로 3번
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("1. 입력  2. 조회  3. 삭제  0. 종료");
            System.out.print("선택: ");

            if (!sc.hasNextInt()) {
                // sc.next() 없이 돌리면 — abc 2 3 을 넣어도 2, 3 이 안 들어가고 3바퀴 다 "잘못된 입력입니다"
                //   abc 가 버퍼에서 안 치워져서 다음 바퀴도 같은 abc 를 또 봄 (5주차 5-2 엔터 남는 것과 같은 규칙)
                sc.next();
                System.out.println("잘못된 입력입니다");
            } else {
                int menu = sc.nextInt();
                String selectMenu = switch (menu) {
                    case 1 -> "입력을";
                    case 2 -> "조회를";
                    case 3 -> "삭제를";
                    case 0 -> "종료를";
                    default -> "등록되지 않은 메뉴를";
                };
                System.out.println(selectMenu + " 선택했습니다");
            }
        }
        sc.close();
    }
}
