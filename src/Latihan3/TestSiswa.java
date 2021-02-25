
package Latihan3;

public class TestSiswa {

    public static void main(String[] args) {
        //membuat ojek siswa
    encapsiswa siswa = new encapsiswa();
    //memberi nilai parameternya
    siswa.setName("agus");
    siswa.setAge(20);
    siswa.setAddress("Malang");
        
        //menampilkan void method
        System.out.println("nama: "+siswa.getName()
        + " alamat "+siswa.getAddress()+ " berumur "+siswa.getAge()
        + " tahun");
    }
    
}

