package week05;

import java.util.Scanner;

public class C3ChangeCalculatorInput {
    public static void main(String[] args) {
        // 도전3 거스름돈 다시 — 3주차 도전1 을 금액 입력받게 고치기
        Scanner sc = new Scanner(System.in);

        System.out.print("금액을 입력하세요: ");
        //int amount = 87600;
        int amount = sc.nextInt();
        int originalAmount = amount;

        int fiftyThousand = amount / 50000;
        amount %= 50000;
        int tenThousand = amount / 10000;
        amount %= 10000;
        int fiveThousand = amount / 5000;
        amount %= 5000;
        int oneThousand = amount / 1000;
        amount %= 1000;
        int fiveHundred = amount /  500;
        amount %= 500;
        int oneHundred = amount / 100;

        System.out.println("50,000 " + fiftyThousand + "장");
        System.out.println("10,000 " + tenThousand + "장");
        System.out.println("5,000 " + fiveThousand + "장");
        System.out.println("1,000 " + oneThousand + "장");
        System.out.println("500 " + fiveHundred + "개");
        System.out.println("100 " + oneHundred + "개");

        // amount 는 연산 중 계속 덮어써져서 나머지(100 미만)만 남아 원래 금액은 따로 저장한 originalAmount 로 출력
        System.out.println("입력하신 " + originalAmount + "원의 거스름돈입니다");

        sc.close();
    }
}
