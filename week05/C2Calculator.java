package week05;

import java.util.Scanner;

public class C2Calculator {
    public static void main(String[] args) {
        // 도전2 계산기
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 수: ");
        int firstNumber = sc.nextInt();

        System.out.print("연산자 (+ - * /): ");
        char operator =  sc.next().charAt(0);

        System.out.print("두 번째 수: ");
        int secondNumber = sc.nextInt();

        double result = (operator == '+') ? firstNumber + secondNumber
                : (operator == '-') ? firstNumber - secondNumber
                : (operator == '*') ? firstNumber * secondNumber
                : firstNumber / secondNumber;

        System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);

        sc.close();
    }
}
