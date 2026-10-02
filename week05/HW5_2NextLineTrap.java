package week05;

import java.util.Scanner;

public class HW5_2NextLineTrap {
    public static void main(String[] args) {
        // 5-2 이름이 안 들어온다
        Scanner sc = new Scanner(System.in);

        System.out.print("나이: ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.print("이름: ");
        String name = sc.nextLine();

        System.out.println("[" + name + "] " + age);

        sc.close();
    }
}
