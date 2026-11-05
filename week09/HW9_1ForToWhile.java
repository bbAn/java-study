package week09;

public class HW9_1ForToWhile {
    public static void main(String[] args) {
        // 9-1 for 를 while 로 옮기기
        //   초기식(int i = 1) → while 위, 조건식(i <= 5) → while() 안, 증감식(i++) → 본문 안
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }

        // 실험 — i++ 를 지우면 무한 루프 1 만 계속 찍힘
//        int i = 1;
//        while (i <= 5) {
//            System.out.println(i);
//        }

        // 실험 — i++ 를 println 위로 옮기면 2 3 4 5 6 이 찍힘 (끝난 뒤 i 는 그대로 6)
//        int i = 1;
//        while (i <= 5) {
//            i++;
//            System.out.println(i);
//        }

        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("끝난 뒤 i: " + i);
    }
}
