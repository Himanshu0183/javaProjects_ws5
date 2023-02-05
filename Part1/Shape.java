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

abstract class Shape {
    //declare and initialize variables
    private String fillcolor = "white";
    private boolean isfilled;
    double size = 1.0;
    double max = 25.0;

    //no-arg constructor.
    public Shape() {
    }

    //overloaded constructor
    protected Shape(String fillcolor, boolean isfilled) {
        this.fillcolor = fillcolor;
        this.isfilled = isfilled;
    }

    //get  methods
    public String getFillcolor() {
        return fillcolor;
    }

    public boolean isIsfilled() {
        return isfilled;
    }

    //set methods
    public void setFillcolor(String fillcolor) {
        this.fillcolor = fillcolor;
    }

    public void setIsfilled(boolean isfilled) {
        this.isfilled = isfilled;
    }

    //abstract methods
    public abstract double getArea();

    public abstract double getPerimeter();

}
