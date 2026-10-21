package week08;

public class HW8_2OffByOne {
    public static void main(String[] args) {
        // 8-2 몇 번 도나요 — off-by-one

        // ①
        int count1 = 0;
        for (int i = 0; i < 10; i++) {
            count1++;
        }
        System.out.println("① " + count1 + "번");

        // ②
        int count2 = 0;
        for (int i = 1; i <= 10; i++) {
            count2++;
        }
        System.out.println("② " + count2 + "번");

        // ③
        int count3 = 0;
        for (int i = 0; i <= 10; i++) {
            count3++;
        }
        System.out.println("③ " + count3 + "번");

        // ④
        int count4 = 0;
        for (int i = 1; i < 10; i++) {
            count4++;
        }
        System.out.println("④ " + count4 + "번");

        // ⑤⑥ — 조건2 i 값도 한 줄로 적용 전 count 만 세는 버전
//        int count5 = 0;
//        for (int i = 1; i <= 10; i += 2) {
//            count5++;
//        }
//        System.out.println("⑤ " + count5 + "번");
//
//        // ⑥
//        int count6 = 0;
//        for (int i = 10; i > 0; i -= 3) {
//            count6++;
//        }
//        System.out.println("⑥ " + count6 + "번");

        // ⑤ (조건 2: i 값도 한 줄로)
        int count5 = 0;
        for (int i = 1; i <= 10; i += 2) {
            System.out.print(i + " ");
            count5++;
        }
        System.out.println("→ " + count5 + "번");

        // ⑥ (조건 2: i 값도 한 줄로)
        int count6 = 0;
        for (int i = 10; i > 0; i -= 3) {
            System.out.print(i + " ");
            count6++;
        }
        System.out.println("→ " + count6 + "번");
    }
}
