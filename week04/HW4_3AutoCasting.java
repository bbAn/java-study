package week04;

public class HW4_3AutoCasting {
    public static void main(String[] args) {
        // 4-3 자동 형변환
        int i = 10;
        double d = i;
        System.out.println(d);

        char c = 'A'; // 실제로는 A의 유니코드값 65가 들어 있음
        int n = c;
        System.out.println(n);

        System.out.println('A' + 1);
        System.out.println((char)('A' + 1));

        double r1 = 10 / 4;
        double r2 = 10 / 4.0;
        System.out.println(r1);
        System.out.println(r2);
    }
}
