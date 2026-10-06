package week05;

import java.util.Scanner;

public class HW5_2NextLineTrap {
    public static void main(String[] args) {
        // 5-2 이름이 안 들어온다
        Scanner sc = new Scanner(System.in);

        System.out.print("나이: ");
        int age = sc.nextInt();

        // 이 줄 없이 바로 nextLine() 으로 이름을 받으면: 이름: [] 20  (엔터만 읽고 끝남)
        sc.nextLine(); // nextInt() 가 남긴 엔터 버리기

        System.out.print("이름: ");
        String name = sc.nextLine();

        System.out.println("[" + name + "] " + age);

        sc.close();
    }
}
