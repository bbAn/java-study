package week06;

import java.util.Scanner;

public class C1CalculatorIf {
    public static void main(String[] args) {
        // 도전1 계산기 다시

        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 수: ");
        int firstNumber = sc.nextInt();

        System.out.print("연산자 (+ - * /): ");
        char operator = sc.next().charAt(0);

        System.out.print("두 번째 수: ");
        int secondNumber = sc.nextInt();

        double result;

        if (operator == '+') {
            result = firstNumber + secondNumber;
        } else if (operator == '-') {
            result = firstNumber - secondNumber;
        } else if (operator == '*') {
            result = firstNumber * secondNumber;
        } else if (operator == '/') {
            if (secondNumber == 0) {
                System.out.println("0 으로 나눌 수 없습니다");
                return;
            }
            result = (double) firstNumber / secondNumber;
        } else {
            System.out.println("지원하지 않는 연산자입니다");
            return;
        }

        System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);

        sc.close();
    }
}

