package javajungsuk3.ch7;

// [7-26] Outer 클래스의 내부 클래스 Inner의 멤버변수 iv의 값을 출력하시오.
class Outer2 {
    static class Inner {
        int iv = 200;
    }
}

public class Exercise0726 {
    public static void main(String[] args) {
        // Outer 인스턴스 생성 불필요
        Outer2.Inner inner = new Outer2.Inner();
        System.out.println(inner.iv);
    }
}
