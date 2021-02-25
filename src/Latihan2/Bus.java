
package Latihan2;

public class Bus{
    //membuat private fields penumpang dan max penumpang
    private int penumpang,maxpenumpang;
   
    //membuat konstruktor dengan parameter max penumpang
    public Bus(int maxpenumpang){
        //menggunakan kata kunci this untuk menghindari variabel shadowing dengan fields max penumpang
        this.maxpenumpang=maxpenumpang;
        penumpang = 0;
    }
    
    //membuat mutator method dengan paramater penumpang. Fungsinya adalah mengubah nilai dari fields penumpang 
    //membuat variabel temp yang akan menunjukkan apakah jumlah penumpang berlebih atau tidak
    public void pluspenumpang(int penumpang){
        int temp;
        temp=this.penumpang+penumpang;
        if (temp>=maxpenumpang){
            System.out.println("Overload penumpang");
        }
        else {
            this.penumpang=temp;
        }       
    }
    //membuat method void bernama cetak yang menampilkan fields penumpang dan maxpenumpang
    public void cetak(){
        System.out.println("Penumpang sekarang = "+penumpang);
        System.out.println("penumpang seharusnya adalah ="+maxpenumpang);
    }
}


