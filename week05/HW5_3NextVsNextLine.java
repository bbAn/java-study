package week05;

import java.util.Scanner;

public class HW5_3NextVsNextLine {
    public static void main(String[] args) {
        // 5-3 next() 와 nextLine()
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.nextLine();
        System.out.println("next=[" + a + "] nextLine=[" + b + "]");

        sc.close();
    }
}
