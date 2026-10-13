package week06;

public class HW6_4SyntaxTypos {
    public static void main(String[] args) {
        // 6-4 한 글자 실수 세 개
        int score = 59;
        // ①
        if (score >= 60) ;
        {
            System.out.println("합격"); // 합격
        }

        // ②
        //if (score = 60) { // incompatible types: int cannot be converted to boolean
        //System.out.println("60점");
        //}

        // ③
        //if (score >= 90) {
        //System.out.println("A");
        //}
        //elseif(score >= 80) { // java: ';' expected
        //System.out.println("B");
        //}
    }
}
