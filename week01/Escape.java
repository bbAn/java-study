package week01;

public class Escape {
    public static void main(String[] args) {
        // 도전 1
        // 1. \n (줄바꿈)
        System.out.println("첫 번째 줄\n두 번째 줄");

        // 2. \t (탭 간격)
        System.out.println("이름\t학번\t\t학과");

        // 3. \" (큰따옴표 문자열 안에 포함)
        System.out.println("안녕하세요 \"자바 1주차!\"");

        // 4. \\ (백슬래시 문자 자체 출력)
        System.out.println("\\java-study\\src\\Hello.java");

        // 도전 2
        System.out.printf("이름 %s, 나이 %d%n", "홍길동", 20);
    }
}
