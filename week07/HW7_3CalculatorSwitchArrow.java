package week07;

import java.util.Scanner;

public class HW7_3CalculatorSwitchArrow {
    public static void main(String[] args) {
        // 7-3 계산기를 switch 로 (선택) -> 버전 — 줄 수 비교용
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 수: ");
        int firstNumber = sc.nextInt();

        System.out.print("연산자 (+ - * /): ");
        char operator = sc.next().charAt(0);

        System.out.print("두 번째 수: ");
        int secondNumber = sc.nextInt();

        double result;

        switch (operator) {
            case '+' -> result = firstNumber + secondNumber;
            case '-' -> result = firstNumber - secondNumber;
            case '*' -> result = firstNumber * secondNumber;
            case '/' -> {
                if (secondNumber == 0) {
                    System.out.println("0 으로 나눌 수 없습니다");
                    return;
                }
                result = (double) firstNumber / secondNumber;
            }
            default -> {
                System.out.println("지원하지 않는 연산자입니다");
                return;
            }
        }

        System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);

        sc.close();
    }
}
