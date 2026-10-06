package week05;

import java.util.Scanner;

public class HW5_5AverageCalcInput {
    public static void main(String[] args) {
        // 5-5 ② 3주차 평균 — 국어·영어·수학 점수를 입력받게 고치기
        Scanner sc = new Scanner(System.in);

        System.out.print("국어: ");
        double korDouble = sc.nextDouble();

        System.out.print("영어: ");
        double engDouble = sc.nextDouble();

        System.out.print("수학: ");
        double matDouble = sc.nextDouble();

        double totalDouble = korDouble + engDouble + matDouble;
        final int SUBJECT_COUNT = 3;
        double avgDouble = totalDouble / SUBJECT_COUNT;

        System.out.println("평균: " + avgDouble);
        System.out.printf("평균: %.2f%n", avgDouble); // 값은 그대로 보여줄 때만 반올림해서 자름

        sc.close();
    }
}
