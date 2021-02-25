/*  Penjelasan program :
    Program yang dibuat berisi main class uji bus dan class bus. 
    pada class bus dibuatlah method cetak yang menampilkan banyaknya penupang dam maximal penumpang.
    Di main class, fields penumpang diubah nilainya sehingga saat method cetak dirun akan terjadi perubahan jumlah penumpang*/
package Latihan1;

public class UjiBus {
    
    public static void main(String[] args) {
        // membuat objek bus mini
        Bus busMini=new Bus();
        //memberikan nilai pada fields sebesar 5
        busMini.penumpang=5;
        busMini.maxpenumpang=5;
        //memanggil method cetal
        busMini.cetak();
        
        //mengganti nilai pada fields penumpang dapat ditulis +=
        busMini.penumpang=busMini.penumpang+5;
        busMini.cetak();
        //mengganti nilai pada fields penumpang dapat ditulis -=
        busMini.penumpang=busMini.penumpang-2;
        busMini.cetak();
        //mengganti nilai pada fields penumpang dapat ditulis +=
        busMini.penumpang=busMini.penumpang+8;
        busMini.cetak();     
    }
}
