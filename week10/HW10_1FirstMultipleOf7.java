package week10;

public class HW10_1FirstMultipleOf7 {
    public static void main(String[] args) {
        // 10-1 첫 번째 7 의 배수
        // int i;
        // int count = 0;
        // for (i = 1; i <= 100; i++) {
        // count++;
        // if (i % 7 == 0) {
        // System.out.println("발견: " + i);
        // break;
        // }
        // }

        // while (true) 로 다시 쓰기
        int i = 1;
        int count = 0;
        while (true) {
            count++;
            if (i % 7 == 0) {
                System.out.println("발견: " + i);
                break;
            }
            i++;
        }
        System.out.println("끝난 뒤 i : " + i);
        System.out.println("돈 바퀴 수 : " + count);
    }
}
