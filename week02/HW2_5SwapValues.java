package week02;

public class HW2_5SwapValues {
    public static void main(String[] args) {
        // 2-5
        char a = '홍';
        char b = '길';
        char c = '동';
        a = b;
        b = c;
        c = a;
        System.out.println("" + a + b + c);
    }
}
