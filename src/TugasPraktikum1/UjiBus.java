
package TugasPraktikum1;

public class UjiBus {
    public static void main(String[] args) {
         //membuat objek bus mini
        Bus busMini=new Bus(10);
        busMini.getPassword(40);
        busMini.getPassword(90);
        busMini.cetak();
        //menganti nilai fields penumpang dengan menambahkannya
        busMini.addPenumpang(3);
        busMini.cetak();
        
        busMini.addPenumpang(1);
        busMini.cetak();
        
        busMini.addPenumpang(19);
        busMini.cetak();       
        
        System.out.println("Rata-rata penumpang bus adalah :" +busMini.getAvarage());
    }
}
