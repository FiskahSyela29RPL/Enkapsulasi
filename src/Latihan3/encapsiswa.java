
package Latihan3;

public class encapsiswa {
    //membuat private fields nama, alamat dan umur
    private String name, address;
    private int age;
    
    //mebuat accessor method untuk menampilkan umur
    public int getAge(){
        return age;
    }
    //mebuat accessor method untuk menampilkan nama
    public String getName(){
        return name;
    }
    //mebuat accessor method untuk menampilkan alamat    
    public String getAddress(){
        return address;
    }
    //mebuat mutator method untuk mengganti nilai umur dengan variabel umur baru
    public void setAge (int newAge){
        age=newAge;
    }
    //mebuat mutator method untuk mengganti nilai nama dengan variabel nama baru    
    public void setName (String newName){
        name=newName;
    }
    //mebuat mutator method untuk mengganti nilai alamat dengan variabel alamat baru    
    public void setAddress (String newAddress){
        address=newAddress;
    }
    
}



