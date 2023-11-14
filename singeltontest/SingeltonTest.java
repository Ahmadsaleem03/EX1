/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.singeltontest;

/**
 *
 * @author user
 */
public class SingeltonTest {
private static  SingeltonTest instance;
private SingeltonTest(){
    System.out.println("New OBJ has been created");
}
public static SingeltonTest getInstance(){
    if(instance==null){
        instance=new SingeltonTest();
    }
    return instance;
}
    public void hello(){
        System.out.println("Hello from singelton");
    }
}
