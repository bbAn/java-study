package week09;

public class HW9_3Over1000 {
    public static void main(String[] args) {
        // 9-3 1000 을 처음 넘는 순간
        int n = 0;
        int sum = 0;
        while (sum <= 1000) {
            n++;
            sum += n;
        }
        System.out.println("n = " + n + ", 합 = " + sum);
    }
}
