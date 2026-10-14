package week06;

import java.util.Scanner;

public class C3RockPaperScissors {
    public static void main(String[] args) {
        // 도전3 가위바위보
        final int COMPUTER = 2;     // 맨 윗줄. 바위

        Scanner sc = new Scanner(System.in);
        System.out.print("가위(1) 바위(2) 보(3) 중 하나: ");
        int user = sc.nextInt();

        if (user < 1 || user > 3) {
            System.out.println("잘못된 입력입니다");
            return;
        }

        System.out.println("컴퓨터: " + COMPUTER);

        // r == 0: 비김, r == 1: user 승, r == 2: user 패
        // user - COMPUTER 가 음수일 수 있어서 +3 으로 보정 (6-1 의 -3 % 2 와 같은 이유 그냥 % 만 쓰면 0 쪽으로 버림되어 음수 나머지가 나옴)
        int r = (user - COMPUTER + 3) % 3; //  user - COMPUTER 값을 3으로 나눈 나머지가 1이면 user가 이김
        if (r == 0) {
            System.out.println("비겼습니다");
        } else if (r == 1) {
            System.out.println("이겼습니다");
        } else {
            System.out.println("졌습니다");
        }

        sc.close();
    }
}
