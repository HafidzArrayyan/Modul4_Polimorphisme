/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2_Interface;

/**
 *
 * @author Lenovo
 */
public class TestUji {
    public static void main(String[] args) {
        Line relasi=new Line(1,2,3,4);
        Line relasi2=new Line(5,6,7,8);
        relasi.getLength();
        System.out.println(relasi.isGreater(relasi, relasi2));
        System.out.println(relasi.isEqual(relasi, relasi2));
        System.out.println(relasi.isLess(relasi, relasi2));
    }
}
