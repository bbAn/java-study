package week04;

public class HW4_4ForceCasting {
    public static void main(String[] args) {
        // 4-4 강제 형변환
        double pi = 3.99;
        int x = (int) pi;
        System.out.println(x);

        int big = 300;
        byte small = (byte) big; // byte 타입의 저장 범위: -128 ~ 127 (256개)
        System.out.println(small);
    }
}
