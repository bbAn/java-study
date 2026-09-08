package week02;

public class Week02 {
    public static void main(String[] args) {
        int age = 25;
        double height = 175.5;
        char grade = 'A';
        boolean pass = true;
        String name = "홍길동";

        System.out.println(name + "님, " + age + "세");
        System.out.println("키 " + height + "cm, 등급 " + grade);
        System.out.println("합격여부: " + pass);

        // 값 바꾸기
        age = 26;
        System.out.println("내년엔 " + age + "세");

        // 상수 - 못 바꿈
        final int MAX = 100;
        System.out.println("최대값 " + MAX);
    }
}
