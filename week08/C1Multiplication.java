package week08;

public class C1Multiplication {
    public static void main(String[] args) {
        // 도전1 구구단
        // 1단계 — 3단만 for 하나로 (조건1: printf)
//        for (int i = 1; i <= 9; i++) {
//            System.out.printf("3 x %d = %d%n", i, 3 * i);
//        }

        // 조건2 질문 — 안쪽 for 변수 이름을 바깥이랑 같은 i 로 바꾸면
        //   C1Multiplication.java:15
        //   java: variable i is already defined in method main(java.lang.String[])
//        for (int i = 1; i <= 9; i++) {
//            for (int i = 1; i <= 9; i++) {
//                System.out.printf("%d x %d = %d%n", i, i, i * i);
//            }
//            System.out.println();
//        }

        // 2단부터 9단까지
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d x %d = %d%n", i, j, i * j);
            }
            System.out.println();
        }
    }
}
