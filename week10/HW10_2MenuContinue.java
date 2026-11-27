package week10;

import java.util.Scanner;

public class HW10_2MenuContinue {
    public static void main(String[] args) {
        // 10-2 지난주 도전1 C1MenuWhile 의 abc 처리를 continue 로
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. 입력  2. 조회  3. 삭제  0. 종료");
            System.out.print("선택: ");
            if (!sc.hasNextInt()) {
                sc.next();
                System.out.println("잘못된 입력입니다");
                continue;
            }
            // abc 면 위에서 continue 로 다음 바퀴로 가서 여기까지 안 옴 → else 필요 없음
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

        System.out.println("종료합니다");
        sc.close();
    }
}
