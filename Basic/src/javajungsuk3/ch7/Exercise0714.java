package javajungsuk3.ch7;

/*
[7-14] 문제7-1에 나오는 섯다카드의 숫자와 종류(isKwang)는
사실 한번 값이 지정되면 변경되어서는 안 되는 값이다.
카드의 숫자가 한번 잘못 바뀌면 똑같은 카드가 두 장이 될 수 도 있기 때문이다.
이러한 문제점이 발생하지 않도록 SutdaCard를 수정하시오.
 */
public class Exercise0714 {
    public static void main(String[] args) {
        SutdaCard card = new SutdaCard(1, true);
//        card.num = 2;
    }
}
