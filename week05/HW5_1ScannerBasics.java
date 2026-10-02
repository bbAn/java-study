package week05;

import java.util.Scanner;

public class HW5_1ScannerBasics {
    public static void main(String[] args) {
        // 5-1 Scanner 첫 사용
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        System.out.println();
        System.out.printf("%s님은 %d살입니다.%n", name, age);

        sc.close();
    }
}
