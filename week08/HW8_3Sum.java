package week08;

public class HW8_3Sum {
    public static void main(String[] args) {
        // 8-3 합계 — 누적 변수는 어디에
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("합계: " + sum);

        // 1단계 — sum 선언을 for 안으로 옮기고, println 은 밖에 둠
        //   바깥에 sum 이 이미 있어서 sum2 로 바꿈 (같은 이름은 already defined)
        //   HW8_3Sum.java:20
        //   java: cannot find symbol  symbol: variable sum2  location: class week08.HW8_3Sum
//        for (int i = 1; i <= 100; i++) {
//            int sum2 = 0;
//            sum2 += i;
//        }
//        System.out.println("합계: " + sum2);

        // 2단계 — 출력문 for문 안으로 넣기
        // 반복문 돌 때 마다 sum2이 0으로 리셋되고 i값이 sum2에 더해져 합계: 100이 찍힘
//        for (int i = 1; i <= 100; i++) {
//            int sum2 = 0;
//            sum2 += i;
//            System.out.println("합계: " + sum2);
//        }


        // 1 부터 100 까지 중 3 의 배수만 더하기
        // 방법 A i 는 1 씩 올리고, 안에서 if (i % 3 == 0) 일 때만 더하기
        int sumA = 0;
        int countA = 0;
        for (int i = 1; i <= 100; i++) {
            countA++;
            if (i % 3 == 0) {
                sumA += i;
            }
        }
        System.out.println("방법 A 합계: " + sumA + ", 도는 횟수: " + countA);

        // 방법 B  i 를 3 부터 시작해서 i += 3
        int sumB = 0;
        int countB = 0;
        for (int i = 3; i <= 100; i += 3) {
            countB++;
            sumB += i;
        }
        System.out.println("방법 B 합계: " + sumB + ", 도는 횟수: " + countB);
    }
}
