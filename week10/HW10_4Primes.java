package week10;

public class HW10_4Primes {
    public static void main(String[] args) {
        // 10-4 소수 출력
        int count = 0;
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("개수 : " + count);
    }
}
