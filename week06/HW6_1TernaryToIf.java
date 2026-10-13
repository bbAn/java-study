package week06;

import java.util.Scanner;

public class HW6_1TernaryToIf {
    // 6-1 삼항을 if 로
    public static void main(String[] args) {
        // 도전 1. 삼항 연산자
        Scanner sc = new Scanner(System.in);
        System.out.print("점수: ");
        int score = sc.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("잘못된 점수입니다"); // 과제 내용 없는 조건 임의 추가
        } else if (score >= 60) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }

        System.out.print("숫자: ");
        int number = sc.nextInt();

        // if (number % 2 == 1) 조건 1 에서 요구한 버전
        // -3 % 2 = -1   number % 2 == 1 을 만족하지 않아 짝수로 판정됨
        if (number % 2 != 0) {
            System.out.println("홀수");
        } else {
            System.out.println("짝수");
        }

        sc.close();
    }
}
