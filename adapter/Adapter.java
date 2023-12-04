/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.adapter;

/**
 *
 * @author user
 */
public class Adapter {

    public static void main(String[] args) {
        C c = new C();
        B b = new B();
        b.setC(c);
        b.processor();

    }
}
