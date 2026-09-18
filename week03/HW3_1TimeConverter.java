package week03;

public class HW3_1TimeConverter {
    public static void main(String[] args) {
        // 3-1
        int total = 3725;
        int hour = total / 3600; // 60분 * 60초
        int remainder = total % 3600;
        int minute = remainder / 60;
        int second = remainder % 60;

        System.out.println(hour + "시간 " + minute + "분 " + second + "초 " );
    }
}
