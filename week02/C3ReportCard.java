package week02;

public class C3ReportCard {
    public static void main(String[] args) {
        // 도전 3
        String studentName = "홍길동";
        double kor = 90;
        double eng = 95.5;
        double mat = 100;
        final int SUBJECT_COUNT = 3;
        double total = kor + eng + mat;
        double avg = total / SUBJECT_COUNT;
        System.out.println("이름 " + studentName);
        System.out.println("총점 " + total);
        System.out.println("평균 " + avg);
    }
}
