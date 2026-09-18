package week03;

public class HW3_2AverageCalc {
    public static void main(String[] args) {
        // 3-2 전부 int
        int kor_int= 85;
        int eng_int = 90;
        int mat_int = 78;
        int total_int = kor_int + eng_int + mat_int;
        int evg_int = total_int / 3;
        System.out.println("전부 int " + evg_int);

        // 3-2 double로 수정
        double kor_double = 85;
        double eng_double = 90;
        double mat_double = 78;
        double total_double = kor_double + eng_double + mat_double;
        double evg_double = total_double / 3;
        System.out.println("모든 값을 double로 수정 " + evg_double);

        // 3-2 (double) 수정 (나누기 전에 붙이기)
        double evg_cast = (double) total_int / 3;
        System.out.println("나누기 전에 (double)를 붙이기 " + evg_cast);
    }
}
