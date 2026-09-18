package week03;

public class HW3_3DigitSplit {
    public static void main(String[] args) {
        // 3-3
        int number = 472;
        int hundred = number / 100;
        int ten = number % 100 / 10;
        int one = number % 10;
        System.out.println(hundred + " " + ten + " " + one);
    }
}
