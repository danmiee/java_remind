package javajungsuk3.ch7;

/*
[7-22] 아래는 도형을 정의한 Shape 클래스이다.
이 클래스를 조상으로 하는 Circle 클래스와 Rectangle 클래스를 작성하시오.
이 때, 생성자도 각 클래스에 맞게 적절히 추가해야 한다.
 */
abstract class Shape {
    Point p;
    double r;
    double width;
    double height;
    Shape() { this(new Point(0,0)); }
    Shape(Point p) { this.p = p; }
    Shape(double r) { this.r = r; }
    Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }
    abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
    Point getPosition() { return p; }
    void setPosition(Point p) { this.p = p; }
}

class Point {
    int x;
    int y;
    Point() { this(0,0); }
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() { return "[" + x + ", " + y + "]"; }
}
// Circle 클래스 : 멤버변수 double r(반지름)
class Circle extends Shape {
    double r;
    Circle(double r) { this.r = r; }
    @Override
    double calcArea() {
        return Math.PI * Math.pow(r, 2);
    }
}

// Rectangle 클래스 : 멤버변수 double width(폭), double height(높이)
// isSquare 메서드 : 정사각형인지 판별, 반환타입 boolean, 매개변수 없음
class Rectangle extends Shape {
    double width;
    double height;
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    double calcArea() {
        return (width * height);
    }
    boolean isSquare() {
        if (width == height) { return true; }
        return false;
    }
}
