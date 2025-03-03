package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (isTriangle(firstSide, secondSide, thirdSide)) {
            System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }
    }

    private boolean isTriangle(double firstSide, double secondSide, double thirdSide) {
        return firstSide + secondSide > thirdSide && firstSide + thirdSide > secondSide
                && secondSide + thirdSide > firstSide;
    }
}