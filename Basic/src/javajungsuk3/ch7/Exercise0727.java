package javajungsuk3.ch7;

// [7-27] 다음과 같은 실행결과를 얻도록 (1) ~ (4) 의 코드를 완성하시오.
// 7-25, 26, 27 문제와 클래스명이 겹쳐서 넘버링함
// 넘버링하지 않으려면 Outer 클래스를 Exercise0727 클래스 내부에 넣고
// Exercise0727 객체도 생성해야함
class Outer3 {
    int value = 10;
    class Inner {
        int value = 20;
        void method1 () {
            int value = 30;
            System.out.println( value );            // (1)
            System.out.println( this.value );       // (2) this로 구분
            System.out.println( Outer3.this.value ); // (3) 클래스명.this로 구분
        }
    }   // Inner 클래스 끝
}   // Outer 클래스 끝

public class Exercise0727 {
    public static void main(String[] args) {
        /* (4) 알맞은 코드를 넣어 완성하시오. */
        Outer3 outer = new Outer3();
        Outer3.Inner inner = outer.new Inner();
        inner.method1();
    }
}
