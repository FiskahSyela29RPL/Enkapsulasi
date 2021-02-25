/*Membuat program yang menggunakan modifiers private dan menerapkan mutator dan accessor method*/

package Latihan2;

public class UjiBus {
    public static void main(String[] args) {
        
        //membuat objek bus mini
        //dan memanggil void method cetak
        Bus busMini=new Bus(10);
        busMini.cetak();
        
        busMini.pluspenumpang(3);
        busMini.cetak();
        
        busMini.pluspenumpang(1);
        busMini.cetak();
        
        busMini.pluspenumpang(1);
        busMini.cetak();
    }

}
