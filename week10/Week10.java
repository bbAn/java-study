package week10;

public class Week10 {
    // 수업 예제
    public static void main(String[] args) {
        // break — 처음 만난 5의 배수에서 종료
        for (int i = 1; i <= 20; i++) {
            if (i % 5 == 0) {
                System.out.println("발견: " + i);
                break;
            }
        }
        // continue — 3의 배수는 건너뛰기
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0)
                continue;

            System.out.print(i + " ");
        }
        System.out.println();
        // 중첩 반복 — 구구단 전체
        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("=== " + dan + "단 ===");
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%d x %d = %2d%n", dan, i, dan * i);
            }
        }
        // 레이블 — 바깥 루프까지 한 번에 탈출
        outer: for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i * j > 12)
                    break outer;
                System.out.print(i * j + " ");
            }
        }

    }
}
