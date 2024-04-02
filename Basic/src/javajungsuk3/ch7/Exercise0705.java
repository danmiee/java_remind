package javajungsuk3.ch7;

// [7-5] 다음의 코드는 컴파일하면 에러가 발생한다.
// 그 이유를 설명하고 에러를 수정하기 위해서는 코드를 어떻게 바꾸어야 하는가?
public class Exercise0705 {
    class Product {
        int price;
        int bonusPoint;

        // 부모클래스인 Product에 기본생성자가 없으므로 만들어줘야함
        Product() {
        }

        Product(int price) {
            this.price = price;
            bonusPoint = (int) (price / 10.0);
        }
    }

    class Tv extends Product {
        Tv() {
        }

        public String toString() {
            return "Tv";
        }
    }
    public void main(String[] args) {
        Tv t = new Tv();
    }
}
