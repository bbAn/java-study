package week09;

public class HW9_5DoWhile {
    public static void main(String[] args) {
        // 9-5 do-while — 한 번은 돈다
//        int i = 10;
//        while (i < 5) {
//            System.out.println("while: " + i);
//            i++;
//        }

//        int j = 10;
//        do {
//            System.out.println("do-while: " + j);
//            j++;
//        } while (j < 5);

        // 실험 — while 뒤에 ; 를 붙이면 본문이 비어서 무한 루프 (8-5 보다 위험, 안 끝남)
//        int k = 1;
//        while (k <= 5); {
//            System.out.println(k);
//            k++;
//        }

        int k = 1;
        while (k <= 5) {
            System.out.println(k);
            k++;
        }
    }
}
