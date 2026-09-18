package week03;

public class HW3_4Increment {
    public static void main(String[] args) {
        // 3-4 i++ vs ++i
        int i = 10;
        System.out.println("i++ " + i++); // 출력: 10 (현재 값인 10을 먼저 출력)
        System.out.println("i " + i); // 출력: 11 (10을 출력 후 i++ 이므로 1이 증가한 11이 됨)

        int j = 10;
        System.out.println("j++ " + ++j); // 출력: 11 (현재 값인 10에 1이 증가한 11이 출력)
        System.out.println("j " + j); // 출력: 11 (증가를 먼저 했기 때문에 여전히 11)

        // i = i++;
         int k = 5;
         k = k++;
         System.out.println("k " + k);
    }
}
