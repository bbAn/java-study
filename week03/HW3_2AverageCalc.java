package week03;

public class HW3_2AverageCalc {
    public static void main(String[] args) {
        // 3-2 전부 int
        int korInt= 85;
        int engInt = 90;
        int matInt = 78;
        int totalInt = korInt + engInt + matInt;
        final int SUBJECT_COUNT = 3;
        int avgInt = totalInt / SUBJECT_COUNT;
        System.out.println("전부 int " + avgInt);

        // 3-2 double로 수정
        double korDouble = 85;
        double engDouble = 90;
        double matDouble = 78;
        double totalDouble = korDouble + engDouble + matDouble;
        double avgDouble = totalDouble / SUBJECT_COUNT;
        System.out.println("모든 값을 double로 수정 " + avgDouble);

        // 3-2 (double) 수정 (나누기 전에 붙이기)
        double avgCast = (double) totalInt / SUBJECT_COUNT;
        System.out.println("나누기 전에 (double)를 붙이기 " + avgCast);
    }
}
