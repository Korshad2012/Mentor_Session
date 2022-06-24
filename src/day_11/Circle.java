package day_11;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class Circle {

    private double radius;
    private double diameter;

    private static double pi;
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
            System.out.println("radius value cannot be smaller than zero "+ radius);
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
