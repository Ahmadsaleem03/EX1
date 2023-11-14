/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singeltontest;

/**
 *
 * @author user
 */
public class Test {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            SingeltonTest test = SingeltonTest.getInstance();
            test.hello();
        }
    }
}
