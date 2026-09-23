package week04;

public class C1TernaryOperator {
    public static void main(String[] args) {
        // 도전 1. 삼항 연산자
        int score = 59;
        String result = score >= 60 ? "합격" : "불합격";
        System.out.println(result);

        int number = 7;
        String resultNumber = (number % 2 == 0) ? "짝수" : "홀수";
        System.out.println(resultNumber);
    }
}
