package katering;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ihul
 */
public class menu {
    private String nama;
    private double harga;
    
    public menu(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }
    
    @Override
    public String toString() {
        return this.nama;
    }

    public String getNamaBarang() {
        return nama;
    }

    public void setNamaBarang(String namaBarang) {
        this.nama = namaBarang;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
}
