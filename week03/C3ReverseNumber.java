package week03;

public class C3ReverseNumber {
    public static void main(String[] args) {
        // 도전 3 단순 출력방식
        int number = 12345;

        System.out.print(number % 10);
        number /= 10;
        // System.out.println(number);

        System.out.print(number % 10);
        number /= 10;
        // System.out.println(number);

        System.out.print(number % 10);
        number /= 10;
        // System.out.println(number);

        System.out.print(number % 10);
        number /= 10;
        // System.out.println(number);

        System.out.print(number % 10);

        System.out.println("");

        // 도전 3 수치 연산 및 누적 방식
        int number2 = 12345;
        int reversed = 0;

        reversed = reversed * 10 + number2 % 10;    // 0 * 10 + 5     = 5
        number2 /= 10;                              // 1234

        reversed = reversed * 10 + number2 % 10;    // 5 * 10 + 4     = 54
        number2 /= 10;                              // 123

        reversed = reversed * 10 + number2 % 10;    // 54 * 10 + 3    = 543
        number2 /= 10;                              // 12

        reversed = reversed * 10 + number2 % 10;    // 543 * 10 + 2   = 5432
        number2 /= 10;                              // 1

        reversed = reversed * 10 + number2 % 10;    // 5432 * 10 + 1  = 54321

        System.out.println(reversed);              // 54321
    }
}
