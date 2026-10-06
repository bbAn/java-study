package week05;

import java.util.Scanner;

public class HW5_6CharInput {
    public static void main(String[] args) {
        // 5-6 char 는 어떻게 받나
        Scanner sc = new Scanner(System.in);

        System.out.print("학점 입력(A/B/C): ");
        // char grade = sc.nextChar();
        //   java: cannot find symbol  symbol: method nextChar()
        String input = sc.next();
        char grade = input.charAt(0);

        System.out.println("학점: " + grade);

        sc.close();
    }
}
