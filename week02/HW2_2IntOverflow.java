package week02;

public class HW2_2IntOverflow {
    public static void main(String[] args) {
        // 2-2
        // int value = 2200000000;
        long value = 2200000000L;
        System.out.println(value);

        // 오버플로우
        int max = 2147483647;
        System.out.println(max + 1);
    }
}
