/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.circle;

/**
 *
 * @author user
 */
public class Demo {

    public static void main(String[] args) {
        Circle c = new Circle(8);
        Circle c1 = new Circle();
        c.getRad();

        c1.setRad(13);
        System.out.println(c1.getArea());
    }
    }
