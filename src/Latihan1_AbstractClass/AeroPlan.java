/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1_AbstractClass;

/**
 *
 * @author Lenovo
 */
public class AeroPlan extends Vehicle{
    public void walk(){
        System.out.println("Aeoroplan is Flying");
    }
    public static void main(String[] args) {
        AeroPlan garuda=new AeroPlan();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }
}
