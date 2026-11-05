package week09;

import java.util.Scanner;

public class Week09 {
    public static void main(String[] args) {
        // 수업 예제
        Scanner sc = new Scanner(System.in);

        // 0을 입력할 때까지 계속 더하기
        int sum = 0;
        while (true) {
            System.out.print("숫자 (0이면 종료): ");
            int n = sc.nextInt();
            if (n == 0) break;
            sum += n;
        }
        System.out.println("합계: " + sum);

        // 자릿수 세기
        int num = 12345;
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        System.out.println("자릿수: " + count); // 5

        // do-while — 최소 한 번은 실행
        int menu;
        do {
            System.out.print("메뉴 (1~3, 0 종료): ");
            menu = sc.nextInt();
        } while (menu != 0);

        sc.close();
    }
}
