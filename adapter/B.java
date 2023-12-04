/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter;

/**
 *
 * @author user
 */
public class B extends C {

    C c = new C();

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }

    public void processor() {
        c.m1();
    }

}
