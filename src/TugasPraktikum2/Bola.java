
package TugasPraktikum2;
import java.lang.Math;

public class Bola {
    private double jariJari;
    
    public void setJariJari (double jariJari){
        this.jariJari = jariJari;
        System.out.println("Jari-jari bola adalah : " +jariJari);
    }
    
    public void showDiameter (){
        System.out.println("Diameter bola adalah : " +2*this.jariJari);
    }
    
    public void showLuasPermukaan() {
        System.out.println("Luas permukaan bola adalah : " +4*Math.PI+(this.jariJari*2));
    }
    
    public void showVolume(){
        System.out.println("Volume bola adalah : " +4 * Math.PI* Math.pow(this.jariJari, 3)/3);
    }
}
