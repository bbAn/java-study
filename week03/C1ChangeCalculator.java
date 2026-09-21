package week03;

public class C1ChangeCalculator {
    public static void main(String[] args) {
        // 도전 1
        int amount = 87600;

        int fiftyThousand = amount / 50000;
        amount %= 50000;
        int tenThousand = amount / 10000;
        amount %= 10000;
        int fiveThousand = amount / 5000;
        amount %= 5000;
        int oneThousand = amount / 1000;
        amount %= 1000;
        int fiveHundred = amount /  500;
        amount %= 500;
        int oneHundred = amount / 100;

        // 원래 값을 다시 사용하려면 별도로 저장하고 사용하지 않을게 확실하다면 덮어쓰기
        // System.out.println(amount + "원의 거스름돈은");

        System.out.println("50,000 " + fiftyThousand + "장");
        System.out.println("10,000 " + tenThousand + "장");
        System.out.println("5,000 " + fiveThousand + "장");
        System.out.println("1,000 " + oneThousand + "장");
        System.out.println("500 " + fiveHundred + "개");
        System.out.println("100 " + oneHundred + "개");
    }
}
