/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author nifsi
 */
public class Mahasiswa {
    String nama;
    String npm;
    String jurusan;
    
    public void nama(String NamaMahasiswa){
    nama=NamaMahasiswa;
}
     public void npm(String NpmMahasiswa) {
        npm = NpmMahasiswa;
     }
      public void jurusan(String JurusanMahasiswa) {
        jurusan = JurusanMahasiswa;
      }
    public void tampil(){
        System.out.println("----- Mahasiswa Bhinneka PGRI -----");
        System.out.println("Nama: " + nama);
        System.out.println("NPM: " + npm);
        System.out.println("Prodi: " + jurusan);
    }
}
    