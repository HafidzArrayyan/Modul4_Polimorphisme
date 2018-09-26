/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3_Polymorphism1;

/**
 *
 * @author Lenovo
 */
public abstract class Pegawai {
    String nama;
    int gaji;
    public void Pegawai(String nm){
        this.nama=nm;
        System.out.println("Pegawai");
    }
    public int gaji(){
        return 0;
    }
}
