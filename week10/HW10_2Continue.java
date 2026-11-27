package week10;

public class HW10_2Continue {
    public static void main(String[] args) {
        // 10-2 3 또는 5 의 배수만 — continue
        int count = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 3 != 0 && i % 5 != 0)
                continue;

            System.out.print(i + " ");
            count++;
        }
        System.out.println();
        System.out.println("개수 : " + count);

        System.out.println();

        // 조건 3: if 로 "할 것" 을 감싸는 방법
        int count2 = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
                count2++;
            }
        }
        System.out.println();
        System.out.println("개수 : " + count2);

        System.out.println();

        // while 로 바꾸고 continue 를 i++ 앞에 둔 것 → 무한 루프
        // i = 1 에서 continue 로 가면 아래 i++ 를 건너뛰어 i 가 1 에서 멈춤
        // int i = 1;
        // while (i <= 50) {
        //     if (i % 3 != 0 && i % 5 != 0) continue;
        //     System.out.print(i + " ");
        //     i++;
        // }

        // 수정: i++ 를 본문 맨 위로 → continue 보다 먼저 실행됨
        // i++ 가 먼저라 시작값은 0, 조건이 i <= 50 이면 마지막에 51 까지 찍혀서 i < 50
        int count3 = 0;
        int i = 0;
        while (i < 50) {
            i++;
            if (i % 3 != 0 && i % 5 != 0) continue;
            System.out.print(i + " ");
            count3++;
        }
        System.out.println();
        System.out.println("개수 : " + count3);

        // 조건을 i <= 50 으로 두면 → 51 까지 찍힘
        // i = 50 에서 들어가 i++ 로 51 이 되고, 51 은 3 의 배수라 출력됨
        // int j = 0;
        // while (j <= 50) {
        //     j++;
        //     if (j % 3 != 0 && j % 5 != 0) continue;
        //     System.out.print(j + " ");
        // }
        // 3 5 6 9 10 12 15 18 20 21 24 25 27 30 33 35 36 39 40 42 45 48 50 51

        System.out.println();

        // 지난주 도전2 "2 와 3 의 배수 빼고" 를 continue 로
        // 위에서 int i 를 이미 써서 변수 이름은 n
        int count4 = 0;
        for (int n = 1; n <= 100; n++) {
            if (n % 2 == 0 || n % 3 == 0) continue;
            System.out.print(n + " ");
            count4++;
        }
        System.out.println();
        System.out.println(count4 + "개");
    }
}
