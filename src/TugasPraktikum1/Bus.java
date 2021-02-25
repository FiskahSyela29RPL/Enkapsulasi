
package TugasPraktikum1;

public class Bus{
    
    //membuat attributes dengan modifier private
    private double penumpang,maxpenumpang, 
                              counter, penumpangBaru;
    
    // konstruktor
    public Bus(int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang = 0;
    }
    
    //method mutator 
    public void addPenumpang (int penumpang){
        int temp;
        //mengubah fields this penumpang menjadi int karna variabel temp berupa int
        temp = (int) (this.penumpang+penumpang);
        if (temp>=maxpenumpang){
            System.out.println("Overload penumpang");
        }
        else {
            this.penumpang=temp;
            counter++;
        }
        
    }
    //method get avar
    public double getAvarage(){
        return penumpang/counter;
    }
    
    public void getPassword(int password){
        if (password==90){
            System.out.println("password benar");
        }
        else{
            System.out.println("password salah");
        }
    }
    public void cetak(){
        System.out.println("Penumpang sekarang = "+penumpang);
        System.out.println("penumpang seharusnya adalah ="+maxpenumpang);
    }


}
