package day_11;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class Circle {

    private double radius; ///
    private double diameter; // ignore

    private static double pi; // ignore
    private static int numbersOfCircles;

    static {
        pi=3.14;
    }

    public Circle(){
        numbersOfCircles++;
    }

    public Circle(double radius){
        this();
       setRadius(radius);
        diameter=radius*2;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<0){
            System.out.println("radius value cannot be smaller than zero ");
            System.exit(1);

        }
        this.radius = radius;
    }

    public static int getNumbersOfCircles() {
        return numbersOfCircles;
    }

    public double areaCal(){
        return radius*radius*pi;

    }

    public double perimeterCal(){
        DecimalFormat df = new DecimalFormat("0.00");
        double perimeter=2*pi*radius;
        return Double.parseDouble(df.format(perimeter));
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + areaCal() +
                ", perimeter=" + perimeterCal() +
                ", number of circle=" +getNumbersOfCircles() +
                '}';
    }
}
//1.define a class called as Circle for the purpose of simple geometrical calculations.
//2.define two fields radius(necessary for all calculations)
//3.and numberOfCircle(keep the info of how many object was created from this class).
//4.decide the type of your variables (static or instance)
//5.create default and parameterized constructors
//6.default constructor should increase the number of object when a new object created
//7.parameterized constructor should increase the number of object when a new object created.
//8.and not allowed to initialize object with the radius value lower than Zero.
//9.create getter and setter methods for radius.
//10.getter
//11.setter if the value of radius is lower than zero keep the previous value.
//12.do not allow any object to change value of static variable just get the current
//13.value of numberOfCircle
//14.calculate area of Circle
//15.calculate perimeter of Circle