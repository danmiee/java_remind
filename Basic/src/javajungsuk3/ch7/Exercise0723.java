package javajungsuk3.ch7;

// [7-23] 문제7-22에서 정의한 클래스들의 면적을 구하는 메서드를 작성하고 테스트 하시오.
public class Exercise0723 {
    /* (1) sumArea 메서드를 작성하시오. */
    public static double sumArea(Shape[] arr) {
        double sum = 0;
        for (Shape s : arr) {
            sum += s.calcArea();
        }
        return sum;
    }

    public static void main(String[] args) {
        Shape[] arr = {new Circle(5.0), new Rectangle(3, 4), new Circle(1) };
        System.out.println("면적의 합:" + sumArea(arr));
    }
}
