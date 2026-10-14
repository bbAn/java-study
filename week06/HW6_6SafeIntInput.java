package week06;

import java.util.Scanner;

public class HW6_6SafeIntInput {
    public static void main(String[] args) {
        // 6-6 터지기 전에 막기
        Scanner sc = new Scanner(System.in);

        System.out.print("나이: ");
        if (sc.hasNextInt()) {
            int age = sc.nextInt();
            System.out.println(age + "살");
        } else {
            System.out.println("숫자를 입력하세요");
        }
        // System.out.println("입력한 나이: " + age);
        //   java: cannot find symbol  symbol: variable age  (17번째 줄)

        sc.close();
    }
}
