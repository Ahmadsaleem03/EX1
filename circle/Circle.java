/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.circle;

/**
 *
 * @author user
 */
public class Circle {

    public static final double pi = 3.14; // Final so the user cant change the number
    private int rad;

    public double getRound() {
        double round = 2 * pi * rad;
        System.out.println(round);
        return round;
    }

    public double getArea() {
        double area = rad * rad * pi;
        System.out.println(area);
        return area;
    }

    public Circle(int rad) {
        this.rad = rad;
    }

    public Circle() {              //constructor overloading one got values the other doesnt have its diffrenet in the signature
    }

    public static double getPi() {
        return pi;
    }

    public void setRad(int rad) { //shaddawing
        if (rad > 0) {
            this.rad = rad;        // so that you cant put a negative number
        } else {
            rad = 0;
        }
    }

    public int getRad() {
        return rad;
    }

}
