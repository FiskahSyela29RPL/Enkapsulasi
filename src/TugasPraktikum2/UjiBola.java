/*Buatlah sebuah class “Bola” dengan property jari-jari dan method setJarijari(), showDiameter(), showLuasPermukaan(), dan showVolume(). Gunakan 
double untuk presisi variable jari-jari dan gunakan library math class untuk menggunakan constanta Math.PI.
Selanjutnya buatlah file testnya dengan urutan langkah, membuat variable Jarijari, menciptakan objek Bola, memanggil method showDiameter(),
showLuasPermukaan(), dan showVolume(). Selanjutnya memanipulasi objek yang telah dibuat dengan memanggil method setJarijari() 
dengan menggunakan variable Jarijari yang telah dibuat. Tampilkan lagi hasilnya dengan menggunakan method showDiameter(), showLuasPermukaan(), 
dan showVolume()*/
package TugasPraktikum2;

public class UjiBola {
    public static void main(String[] args) {
        double jariJari = 19;
        Bola Bola = new Bola();
        Bola.showDiameter();
        Bola.showLuasPermukaan();
        Bola.showVolume();
        
        Bola.setJariJari(30);
        Bola.showDiameter();
        Bola.showLuasPermukaan();
        Bola.showVolume();      
    }

}
