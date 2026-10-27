package week08;

public class Week08 {
    public static void main(String[] args) {
        // 수업 예제
        // 1부터 10까지 출력
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        // 1부터 100까지 합
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("합계: " + sum); // 5050
        // 구구단 3단
        for (int i = 1; i <= 9; i++) {
            System.out.printf("3 x %d = %d%n", i, 3 * i);
        }
        // 거꾸로
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        // 2씩 증가 (짝수)
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
    }
}