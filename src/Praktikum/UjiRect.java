/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author Lenovo
 */
public class UjiRect {
     public static void main(String[] args) {
        Rect rect1=new Rect(1,1,4,4);
        Rect rect2=new Rect(2,3,5,6);
        System.out.println("<2,3> is Inside the Union");
        System.out.println(rect1+" Union "+rect2+"="+rect1.union(rect2));
        System.out.println(rect1+" Intersect "+rect2+"="+rect1.intersection(rect2));
        
        
    }
}
