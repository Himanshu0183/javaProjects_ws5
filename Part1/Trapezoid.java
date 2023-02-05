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

public class Trapezoid extends Shape implements Adjustable , Serializable {
    //declare and initialize variables
    private static final long serialVersionUID = 1L;
    protected double baseA = 1.0, baseB = 1.0, legA = 1.0, legB = 1.0, height = 1.0;

    //no-arg constructor.
    public Trapezoid() {
    }

    //overloaded constructor
    public Trapezoid(double baseA, double baseB, double legA, double legB, double height) throws InvalidShapeSizeException {
        if (baseA < size || baseA > max) {
            throw new InvalidShapeSizeException("baseA size not in range of min and max value");
        } else if (baseB < size || baseB > max) {
            throw new InvalidShapeSizeException("baseB size not in range of min and max value");
        } else if (legA < size || legA > max) {
            throw new InvalidShapeSizeException("SideA size not in range of min and max value");
        } else if (legB < size || legB > max) {
            throw new InvalidShapeSizeException("SideB size not in range of min and max value");
        } else if (height < size || height > max) {
            throw new InvalidShapeSizeException("Height size not in range of min and max value");
        }
        this.baseA = baseA;
        this.baseB = baseB;
        this.legA = legA;
        this.legB = legB;
        this.height = height;
    }

    //get methods
    public double getBaseA() {
        return baseA;
    }

    public double getBaseB() {
        return baseB;
    }

    public double getLegA() {
        return legA;
    }

    public double getLegB() {
        return legB;
    }

    public double getHeight() {
        return height;
    }
    //get area
    @Override
    public double getArea() {
        return (baseA + baseB) * height / 2;
    }

    //get perimeter
    @Override
    public double getPerimeter() {
        return baseA + baseB + legA + legB;
    }

    //to string method
    @Override
    public String toString() {
        return "Trapezoid : \n\tArea : " + getArea() +
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
        double _baseA = baseA + (baseA * (percentage / 100.0));
        double _baseB = baseB + (baseB * (percentage / 100.0));
        double _legA = legA + (legA * (percentage / 100.0));
        double _legB = legB + (legB * (percentage / 100.0));
        double _height = height + (height * (percentage / 100.0));

        if (_baseA < size || _baseA > max) {
            throw new InvalidShapeSizeException("increased baseA size not in range of min and max value");
        } else if (_baseB < size || _baseB > max) {
            throw new InvalidShapeSizeException("increased baseB size not in range of min and max value");
        } else if (_legA < size || _legA > max) {
            throw new InvalidShapeSizeException("increased SideA size not in range of min and max value");
        } else if (_legB < size || _legB > max) {
            throw new InvalidShapeSizeException("increased SideB size not in range of min and max value");
        } else if (_height < size || _height > max) {
            throw new InvalidShapeSizeException("increased Height size not in range of min and max value");
        }
        this.baseA = _baseA;
        this.baseB = _baseB;
        this.legA = _legA;
        this.legB = _legB;
        this.height = _height;
    }

    @Override
    public void decSize(int percentage) throws InvalidShapeSizeException {
        double _baseA = baseA - (baseA * (percentage / 100.0));
        double _baseB = baseB - (baseB * (percentage / 100.0));
        double _legA = legA - (legA * (percentage / 100.0));
        double _legB = legB - (legB * (percentage / 100.0));
        double _height = height - (height * (percentage / 100.0));
        if (_baseA < size || _baseA > max) {
            throw new InvalidShapeSizeException("decreased baseA size not in range of min and max value");
        } else if (_baseB < size || _baseB > max) {
            throw new InvalidShapeSizeException("decreased baseB size not in range of min and max value");
        } else if (_legA < size || _legA > max) {
            throw new InvalidShapeSizeException("decreased SideA size not in range of min and max value");
        } else if (_legB < size || _legB > max) {
            throw new InvalidShapeSizeException("decreased SideB size not in range of min and max value");
        } else if (_height < size || _height > max) {
            throw new InvalidShapeSizeException("decreased Height size not in range of min and max value");
        }
        this.baseA = _baseA;
        this.baseB = _baseB;
        this.legA = _legA;
        this.legB = _legB;
        this.height = _height;


    }
}
