package week07;

import java.util.Scanner;

public class HW7_4GradeSwitch {
    public static void main(String[] args) {
        // 7-4 학점을 switch 로 — 될까
        Scanner sc = new Scanner(System.in);

        System.out.print("점수: ");
        int score = sc.nextInt();

        // java: incompatible types: boolean cannot be converted to int
//        switch (score) {
//            case score >= 90:
//                System.out.println("A");
//                break;
//            case score >= 80:
//                System.out.println("B");
//                break;
//            case score >= 70:
//                System.out.println("C");
//                break;
//            case score >= 60:
//                System.out.println("D");
//                break;
//            case score < 0 || score > 100:
//                System.out.println("잘못된 점수입니다");
//                break;
//            default:
//                System.out.println("F");
//                break;
//        }
// 아래 if 활성화시 101, -5 잘못된 점수입니다로 나옴
//        if (score < 0 || score > 100) {
//            System.out.println("잘못된 점수입니다");
//            return;
//        }

        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }

        sc.close();
    }
}
