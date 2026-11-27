package week10;

public class HW10_3Stars {
    public static void main(String[] args) {
        // 10-3 별 5 종

        int n = 5;
        int count;

        System.out.println("① 직각삼각형");
        count = 0;

        for (int row = 1; row <= n; row++) { // row = 줄 k
            for (int col = 1; col <= row; col++) { // 별 k 개
                System.out.print("*");
                count++;
            }
            System.out.println();
        }
        System.out.println("별 개수 : " + count);
        System.out.println();

        System.out.println("② 역삼각형");
        count = 0;
        for (int row = 1; row <= n; row++) { // row = 줄 k
            for (int col = 1; col <= n - row + 1; col++) { // 별 n-k+1 개
                System.out.print("*");
                count++;
            }
            System.out.println();
        }
        System.out.println("별 개수 : " + count);
        System.out.println();

        System.out.println("③ 오른쪽 정렬");
        count = 0;
        for (int row = 1; row <= n; row++) { // row = 줄 k
            for (int col = 1; col <= n - row; col++) { // 공백 n-k 개
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) { // 별 k 개
                System.out.print("*");
                count++;
            }
            System.out.println();
        }
        System.out.println("별 개수 : " + count);
        System.out.println();

        System.out.println("④ 피라미드");
        count = 0;
        for (int row = 1; row <= n; row++) { // row = 줄 k
            for (int col = 1; col <= n - row; col++) { // 공백 n-k 개
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) { // 별 2k-1 개
                System.out.print("*");
                count++;
            }
            System.out.println();
        }
        System.out.println("별 개수 : " + count);
        System.out.println();

        System.out.println("⑤ 다이아몬드");
        count = 0;
        // 위쪽 n 줄: ④ 피라미드 그대로
        for (int row = 1; row <= n; row++) { // row = 줄 k
            for (int col = 1; col <= n - row; col++) { // 공백 n-k 개
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) { // 별 2k-1 개
                System.out.print("*");
                count++;
            }
            System.out.println();
        }
        // 아래쪽 n-1 줄: 가운데 줄은 위에서 찍었으니 한 줄 뺌
        for (int row = 1; row <= n - 1; row++) { // row = 아래쪽 줄 k
            for (int col = 1; col <= row; col++) { // 공백 k 개
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * (n - row) - 1; col++) { // 별 2(n-k)-1 개
                System.out.print("*");
                count++;
            }
            System.out.println();
        }
        System.out.println("별 개수 : " + count);
    }
}
