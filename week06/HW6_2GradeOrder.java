package week06;

import java.util.Scanner;

public class HW6_2GradeOrder {
    public static void main(String[] args) {
        // 6-2 학점 — 순서가 답을 바꾼다
        Scanner sc = new Scanner(System.in);

        System.out.print("점수: ");
        int score = sc.nextInt();

        // 정상순서
        if (score < 0 || score > 100) {
            System.out.println("잘못된 점수입니다");
        } else if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        // 뒤집은 순서
//        if (score < 0 || score > 100) {
//            System.out.println("잘못된 점수입니다");
//        } else if (score >= 60) {
//            System.out.println("D");
//        } else if (score >= 70) {
//            System.out.println("C");
//        } else if (score >= 80) {
//            System.out.println("B");
//        } else if (score >= 90) {
//            System.out.println("A");
//        } else {
//            System.out.println("F");
//        }

        sc.close();
    }
}
