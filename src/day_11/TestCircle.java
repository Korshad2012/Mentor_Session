package day_11;

public class TestCircle {

    public static void main(String[] args) {

       Circle circle1 = new Circle();

        System.out.println(Circle.getNumbersOfCircles());
        System.out.println(circle1);

        Circle circle2 = new Circle(5);

        System.out.println(Circle.getNumbersOfCircles());
        System.out.println(circle2);

    }
}
