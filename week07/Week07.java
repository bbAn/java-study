package week07;

public class Week07 {
    public static void main(String[] args) {
        int month = 3;
        // 전통 방식
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("겨울");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름");
                break;
            default:
                System.out.println("가을");
        }
        // 새 방식 (JDK 14+) — 훨씬 간단
        String season = switch (month) {
            case 12, 1, 2 -> "겨울";
            case 3, 4, 5 -> "봄";
            case 6, 7, 8 -> "여름";
            default -> "가을";
        };
        System.out.println(season);
    }
}
