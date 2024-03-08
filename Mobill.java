/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mobill;

/**
 *
 * @author hp
 */

public class Mobill { 
    // Atribut
    private String merk;
    private int tahunProduksi;

    
// Konstruktor
    public Mobill(String merk, int tahunProduksi) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }

    // Getter dan Setter
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    // Metode untuk menampilkan detail mobil
    public void tampilkanDetail() {
        System.out.println("Merk Mobil: " + merk + "\nTahun Produksi: " + tahunProduksi);
    }
}
