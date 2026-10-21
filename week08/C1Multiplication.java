package week08;

public class C1Multiplication {
    public static void main(String[] args) {
        // 도전1 구구단
        // 조건2 질문 — 안쪽 for 변수 이름을 바깥이랑 같은 i 로 바꾸면
        //   C1Multiplication.java:10
        //   java: variable i is already defined in method main(java.lang.String[])
//        for (int i = 1; i <= 9; i++) {
//            for (int i = 1; i <= 9; i++) {
//                System.out.printf("%d x %d = %d%n", i, i, i * i);
//            }
//            System.out.println();
//        }

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d x %d = %d%n", i, j, i * j);
            }
            System.out.println();
        }
    }
}
