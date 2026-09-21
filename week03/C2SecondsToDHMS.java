package week03;

public class C2SecondsToDHMS {
    public static void main(String[] args) {
        // 도전 2
        int total = 1000000;

        int day = total / (24 * 60 * 60); // 86400 (1일 = 24시간 * 60분 * 60초)
        total %= 24 * 60 * 60;

        int hour = total / (60 * 60); // 3600 (1시간 = 60분 * 60초)
        total %= 60 * 60;

        int minutes = total / 60;
        total %= 60;

        int seconds = total;

        System.out.println(day + "일 " + hour + "시간 " + minutes + "분 " + seconds + "초 ");
    }
}
