package week08;

public class HW8_5SemicolonTrap {
    public static void main(String[] args) {
        // 8-5 세미콜론 하나

        // 1단계 — ; 트랩 (과제에 준 모양 그대로)
        //   "안녕"이 1번 출력
        //   ;가 바로 for문을 끝내고 뒤에 { }는 반복과 상관 없이 한 번 실행되는 별개의 코드가 됨
//        for (int i = 1; i <= 5; i++) ;
//        {
//            System.out.println("안녕");
//        }

        // 2단계 — println("안녕") 을 println(i) 로 바꾸면
        //   HW8_5SemicolonTrap.java:20
        //   java: cannot find symbol  symbol: variable i  location: class week08.HW8_5SemicolonTrap
//        for (int i = 1; i <= 5; i++) ;
//        {
//            System.out.println(i);
//        }

        // 3단계 — 증감식(i++) 을 지우면 무한 루프
        for (int i = 1; i <= 5; ) {
            System.out.println(i);
        }
    }
}
