package javajungsuk3.ch7;

// [7-2] 문제7-1의 SutdaDeck클래스에 다음에 정의된 새로운 메서드를 추가하고 테스트 하시오.
class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        /* (1) 배열 SutdaCard를 적절히 초기화 하시오. */
        for (int i = 0; i < cards.length; i++) {
            if (i < 10) {
                if (i + 1 == 1 || i + 1 == 3 || i + 1 == 8) {
                    cards[i] = new SutdaCard(i + 1, true);
                } else {
                    cards[i] = new SutdaCard(i + 1, false);
                }
            } else {
                cards[i] = new SutdaCard(i - 9, false);
            }
        }
    }

    /* 정의된 세 개의 메서드를 작성하시오. */
    /*
    1.  메서드명 : shuffle
        기    능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다.(Math.random() 사용)
        반환타입 : 없음
        매개변수 : 없음
    */
    void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int ranNum = (int) (Math.random() * cards.length);
            SutdaCard tmp = cards[i];
            cards[i] = cards[ranNum];
            cards[ranNum] = tmp;
        }
    }

    /*
    2.  메서드명 : pick
        기    능 : 배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
        반환타입 : SutdaCard
        매개변수 : int index - 위치
    */
    SutdaCard pick(int index) {
        return cards[index];
    }

    /*
    3.  메서드명 : pick
        기    능 : 배열 cards에서 임의의 위치의 SutdaCard를 반환한다.(Math.random() 사용)
        반환타입 : SutdaCard
        매개변수 : 없음
     */
    SutdaCard pick() {
        int ranNum = (int) (Math.random() * cards.length);
        return cards[ranNum];
    }
}
