package oop1.ex;

public class Rectangle {
    int width;
    int height;

     int calculateArea() {//매개변수 필요 없음, 내 매개변수 쓰면 되니까
        return width * height;
    }

     int calculatePerimeter() {
        return 2 * (width + height);
    }

     boolean isSquare() {
        return width == height;
    }
}
