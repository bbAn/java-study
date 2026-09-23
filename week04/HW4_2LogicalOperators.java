package week04;

public class HW4_2LogicalOperators {
    public static void main(String[] args) {
        // 4-2 논리 연산자
        int age = 20;
        boolean hasTicket = true;

        System.out.println("age >= 19 && hasTicket -> " + (age >= 19 && hasTicket));
        System.out.println("age >= 19 || hasTicket -> " + (age >= 19 || hasTicket));
        System.out.println("!hasTicket -> " + !hasTicket);
    }
}
