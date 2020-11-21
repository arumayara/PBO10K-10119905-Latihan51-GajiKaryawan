/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan51.GajiKaryawan;

/**
 *
 * @author aruma
 */
public class Manager extends Karyawan {
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
        
    }
    
    public float tunjanganKehadiran(int hadir){
        return tunjanganKehadiran = hadir*10000;
    }
    
    public float tunjanganJabatan (String jabatan){
        if (null == jabatan )tunjanganJabatan = 0; else tunjanganJabatan = switch (jabatan) {
            case "Manager" -> 2000000;
            case "Kabag" -> 1000000;
            default -> 0;
        };
        return tunjanganJabatan;
    }
    
    public float tunjanganGolongan (int golongan){
        tunjanganGolongan = switch (golongan) {
            case 1 -> 500000;
            case 2 -> 1000000;
            case 3 -> 1500000;
            default -> 0;
        };
        return tunjanganGolongan;
    }
    
    public float gajiTotal(){
        return tunjanganJabatan + tunjanganGolongan + tunjanganKehadiran;
    }
}
