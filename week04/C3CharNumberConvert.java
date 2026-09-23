package week04;

public class C3CharNumberConvert {
    public static void main(String[] args) {
        // 도전 3. 문자 ↔ 숫자
        char digit = '7';
        System.out.println(digit - '0'); // char 타입끼리 빼기 연산을 하면 내부 아스키(유니코드) 숫자 값으로 연산
        System.out.println(digit + 1);
        System.out.println((char)(digit + 1));

        char lower = 'a';
        System.out.println((char)(lower - 32));
    }
}
