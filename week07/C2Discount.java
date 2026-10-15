package week07;

import java.util.Scanner;

public class C2Discount {
    public static void main(String[] args) {
        // 도전2 등급별 할인
        Scanner sc = new Scanner(System.in);
        System.out.print("등급: ");
        String grade = sc.next();

        int discount = switch (grade) {
            case "BRONZE" -> 3;
            case "SILVER" -> 5;
            case "GOLD" -> 10;
            default -> 0;
        };

        // 과제 내용 없는 조건 임의 추가
        if (discount == 0) {
            System.out.println("등록되지 않은 등급입니다 (할인율 0%)");
        } else {
            System.out.println("할인율: " + discount + "%");
        }
    }
}
