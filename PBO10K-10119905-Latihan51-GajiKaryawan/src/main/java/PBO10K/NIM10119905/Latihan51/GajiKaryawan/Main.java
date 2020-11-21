/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan51.GajiKaryawan;
import java.util.Scanner;
/**
 *
 * @author
 * Nama  : Abraham Rumayara
 * KELAS : IF10K
 * NIM   : 10119905
 * Deskripsi Program : Program Gaji Karyawan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama, nik , jabatan;
        int golongan, kehadiran;
        Scanner input = new Scanner(System.in);
        Karyawan objKaryawan = new Karyawan() ;
        Manager objManager = new Manager();
        
        //INPUT
        System.out.println("=== Program perhitungan gaji karyawan ===");
        System.out.println("Masukan NIK : ");
        nik = input.next();
        objKaryawan.setNik(nik); 
        
        System.out.println("Masukan Nama : ");
        nama = input.next();
        objKaryawan.setNama(nama);
        
        System.out.println("Masukan Golongan (1/2/3) : ");
        golongan = input.nextInt();
        objKaryawan.setGolongan(golongan);   
        
        System.out.println("Masukan Jabatan (Manager / Kabag) : ");
        jabatan = input.next();
        objKaryawan.setJabatan(jabatan);
        
        System.out.println("Masukan jumlah kehadiran : ");
        kehadiran = input.nextInt();
        objManager.setKehadiran(kehadiran);
        
        System.out.println("");
        
        //OUTPUT
        System.out.println("=== Hasil Perhitungan ===");
        System.out.println("NIK : "+ objKaryawan.getNik());
        System.out.println("Nama : "+ objKaryawan.getNama());
        System.out.println("Golongan : "+ objKaryawan.getGolongan());
        System.out.println("Jabatan : "+ objKaryawan.getJabatan());
        System.out.println("");
        System.out.println("Tunjangan Golongan : " + objManager.tunjanganGolongan(golongan));
        System.out.println("Tunjangan Jabatan : "+ objManager.tunjanganJabatan(jabatan));
        System.out.println("Tunjangan Kehadiran : " + objManager.tunjanganKehadiran(kehadiran));
        System.out.println("");
        System.out.println("Total Gaji :"+ objManager.gajiTotal());
    }
    
}
