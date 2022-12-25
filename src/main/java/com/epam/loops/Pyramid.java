package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int rowNumber = 0; rowNumber < cathetusLength; rowNumber++) {
            for (int j = 0; j < cathetusLength + rowNumber; j++) {
                if (j >= cathetusLength - rowNumber - 1 && j < cathetusLength) {
                    System.out.print(cathetusLength - j);
                } else if ( j >= cathetusLength) {
                    System.out.print(j - cathetusLength + 2);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}