package javajungsuk3.ch7;

// [7-25] Outer 클래스의 내부 클래스 Inner의 멤버변수 iv의 값을 출력하시오.
class Outer1 {
    class Inner {
        int iv = 100;
    }
}
public class Exercise0725 {
    public static void main(String[] args) {
        /* (1) 알맞은 코드를 넣어 완성하시오. */
        // Outer 인스턴스 먼저 생성 필요
        Outer1 outer = new Outer1();
        Outer1.Inner inner = outer.new Inner();
        System.out.println(inner.iv);
    }
}
