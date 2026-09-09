package week02;

public class HW2_5SwapValues {
    public static void main(String[] args) {
        // 2-5
        String a = "홍";
        String b = "길";
        String c = "동";

        System.out.println("전 " + "" + a + b + c);

        String temp = c; // 마지막 값('동')을 temp에 백업
        c = b;         // b의 값('길')을 c에 넣음
        b = a;         // a의 값('홍')을 b에 넣음
        a = temp;      // 백업해 둔 '동'을 a에 넣음

        System.out.println("후 " + "" + a + b + c);
    }
}
