package week07;

public class HW7_2NoBreak {
    public static void main(String[] args) {
        // 7-2 break 를 빼면
        int day = 9;
        switch (day) {
            case 1:
                System.out.println("월");
            case 2:
                System.out.println("화");
            case 3:
                System.out.println("수");
            default:
                System.out.println("모름");
        }
    }
}