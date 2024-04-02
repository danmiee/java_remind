package javajungsuk3.ch7;

/*
[7-1] 섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것이다.
섯다카드 20장을 담는 SutdaCard배열을 초기화하시오.
단, 섯다카드는 1부터 10까지의 숫자가 적힌 카드가 한 쌍씩 있고,
숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광(Kwang)이어야 한다.
즉, SutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다.
*/

public class Exercise0701 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        for (int i=0; i<deck.cards.length; i++) {
            System.out.print(deck.cards[i]+",");
        }
    }
}
