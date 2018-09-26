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
public class PembayaranGaji {
     public int hitungGaji(Pegawai peg){
        int uang =peg.gaji();
        if(peg instanceof Direktur)
            uang+=((Direktur)peg).tunjangan();
        if(peg instanceof Staff)
          uang+=((Staff)peg).Bonus();
        return uang;
    }
    public static void main(String[] args) {
        PembayaranGaji pg=new PembayaranGaji();
        Staff ali=new Staff();
        Direktur tony=new Direktur();
        System.out.println("Gaji yang dibayarkan unruk Staff ="+pg.hitungGaji(ali));
        System.out.println("Gaji yang dibayarkan kepada Direktur ="+pg.hitungGaji(tony));
        
    }
}
