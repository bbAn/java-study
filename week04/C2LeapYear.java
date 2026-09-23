package week04;

public class C2LeapYear {
    public static void main(String[] args) {
        // 도전 2. 윤년
        int year = 2024;

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        System.out.println(year + "년 " + (isLeapYear ? "윤년 ⭕":"윤년 아님 ❌"));
//        System.out.println(year % 4);
//        System.out.println(year % 100);
//        System.out.println(year % 400);
    }
}
