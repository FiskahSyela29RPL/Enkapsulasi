
package Latihan4;

public class UjiBus {
    public static void main(String[] args) {
        //membuat objek bus mini
        Bus busMini=new Bus(10);
        busMini.getPassword(40);
        busMini.getPassword(90);
        busMini.cetak();
        //menganti nilai fields penumpang dengan menambahkannya
        busMini.pluspenumpang(3);
        busMini.cetak();
        
        busMini.pluspenumpang(1);
        busMini.cetak();
        
        busMini.pluspenumpang(1);
        busMini.cetak();       
    }
}
