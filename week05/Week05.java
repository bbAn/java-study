package week05;
import java.util.Scanner;

public class Week05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름: "); // 화면에 "이름: "이라는 문구를 출력. (println이 아닌 print를 썼기 때문에 줄바꿈 없이 바로 옆에 입력을 기다림.)
        String name = sc.nextLine(); // 사용자가 한 줄 전체(엔터를 칠 때까지)를 입력할 때까지 기다렸다 입력한 문자열을 읽어와 String 타입의 변수 name에 저장.

        System.out.print("나이: ");
        int age = sc.nextInt(); // 사용자가 입력한 값 중 정수(int)만 읽어와 age 변수에 저장.

        System.out.print("키: ");
        double height = sc.nextDouble(); // 사용자가 입력한 값 중 실수(double, 소수점이 있는 숫자)를 읽어와 height 변수에 저장. (예: 175.5)

        System.out.println();
        System.out.printf("%s님은 %d세, %.1fcm 입니다.%n", name, age, height);
        // %s: 문자열(String)이 들어갈 자리 -> name이 매핑됨
        // %d: 10진수 정수(int)가 들어갈 자리 -> age가 매핑됨
        // %.1f: 실수(double)를 소수점 아래 첫째 자리까지만 출력하라는 의미 -> height가 매핑됨 (예: 175.5000이어도 175.5로 출력)
        // %n: 줄바꿈(엔터)을 의미.

        sc.close(); // 스캐너 닫기
    }
}
