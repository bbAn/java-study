package week09;

import java.util.Scanner;

public class C3SentinelSum {
    public static void main(String[] args) {
        // 도전3 0 이 나올 때까지 더하기 — 보초값
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            System.out.print("숫자 (0이면 종료): ");
            int n = sc.nextInt();
            if (n == 0) break;
            sum += n;
            count++;
        }

        if (count == 0) {
            System.out.println("입력이 없습니다");
        } else {
            double avg = (double) sum / count;
            System.out.println("합계: " + sum + ", 개수: " + count + ", 평균: " + avg);
        }
        sc.close();

        // sum += n, count++ 를 break 보다 위로 옮기면 0도 count 에 포함됨
        // (합계: 60, 개수: 4, 평균: 15.0 으로 출력 정상은 개수 3, 평균 20.0)
//        while (true) {
//            System.out.print("숫자 (0이면 종료): ");
//            int n = sc.nextInt();
//            sum += n;
//            count++;
//            if (n == 0) break;
//        }
        // int avg =  sum / count;
    }
}
