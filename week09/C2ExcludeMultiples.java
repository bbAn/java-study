package week09;

public class C2ExcludeMultiples {
    public static void main(String[] args) {
        // 도전2 2 와 3 의 배수 빼고
        int i = 1;
        int count = 0;
        while (i <= 100) {
            if (i % 2 != 0 && i % 3 != 0) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
        System.out.println();
        System.out.println(count + "개");

        //i++ 를 if 안에 넣으면 i=2 에서 if를 진행할 수 없음 i++ 도 실행되지 않아 무한 루프 (멈춘 지점: i=2)
//        while (i <= 100) {
//            if (i % 2 != 0 && i % 3 != 0) {
//                System.out.print(i + " ");
//                count++;
//                i++;
//            }
//        }
    }
}
