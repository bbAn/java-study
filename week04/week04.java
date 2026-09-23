package week04;

public class week04 {
    public static void main(String[] args) {
        int age = 20;
        int score = 85;
        System.out.println(age >= 19); // true
        System.out.println(age == 20 && score >= 80);
        System.out.println(age < 19 || score >= 90); // true
        // false
        System.out.println(!(age >= 19)); // false
        // 형변환
        int i = 10;
        double d = i; // 자동 (10 → 10.0)
        double pi = 3.99;
        int n = (int) pi; // 강제 → 3 (버림, 반올림 아님)
        System.out.println(d + " / " + n);
        // 삼항 연산자
        String result = score >= 60 ? "합격" : "불합격";
        System.out.println(result);
    }
}
