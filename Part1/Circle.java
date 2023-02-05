/**********************************************
Workshop 5
Course: JAC 444 - Summer 2022
Last Name: Himanshu
First Name: Himanshu
ID: 146109202
Section: ZBB
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature  Himanshu
Date: 07/10/2022
**********************************************/

import java.io.Serializable;

public class Circle extends Shape implements Adjustable , Serializable {
    //declare and initialize variable
    private static final long serialVersionUID = 1L;
    protected double radius = 1.0;

    //no-arg constructor.
    public Circle() {
    }

    //overloaded constructor
    public Circle(double radius) throws InvalidShapeSizeException {
        if (radius < size || radius > max) {
            throw new InvalidShapeSizeException("radius size not in range of min and max value");
        }
        this.radius = radius;
    }

    //get method
    public double getRadius() {
        return radius;
    }

    //get area
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    //get perimeter
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    //to string method
    @Override
    public String toString() {
        return "Circle : \n\tArea : " + getArea() +
                "\n\tPerimeter : " + getPerimeter() +
                "\n\tfillcolor : " + getFillcolor() +
                "\n\tfilled  : " + isIsfilled();
    }

    //check if equal
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    //override interface methods
    @Override
    public void incSize(int percentage) throws InvalidShapeSizeException {
        double inc = radius + (radius * (percentage / 100.0));
        if (inc < size || inc > max) {
            throw new InvalidShapeSizeException("increased radius size not in range of min and max value");
        }
        radius = inc;
    }

    @Override
    public void decSize(int percentage) throws InvalidShapeSizeException {
        double dec = radius - (radius * (percentage / 100.0));
        if (dec < size || dec > max) {
            throw new InvalidShapeSizeException("decreased radius size not in range of min and max value");
        }
        radius = dec;
    }
}
