/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Alhamsya
 */
public class diskon {

    private int jarak;
    private int kondisi;
    private int per_km;

    public diskon(int n_jarak, int n_kondisi) {
        jarak = n_jarak;
        kondisi = n_kondisi;
        per_km = 7000;
    }

    public int get_kondisi() {
        int perhitungan = 0;
        switch (kondisi) {
            case 1:
                perhitungan = 0;
                break;
            case 2:
                perhitungan = 3000;
                break;
            case 3:
                perhitungan = 5000;
                break;
            default:
                System.out.println("Invalid Input.");
        }
        return perhitungan;
    }

    public int get_jarak() {
        return jarak;
    }

    public int get_diskon() {
        int diskon = 0;
        if (jarak >= 1 && jarak <= 5) {
            diskon = 2000;
        } else if (jarak >= 6 && jarak <= 10) {
            diskon = 4000;
        } else if (jarak >= 11 && jarak <= 15) {
            diskon = 6000;
        } else if (jarak >= 16 && jarak <= 20) {
            diskon = 10000;
        }
        return diskon;
    }

    public int get_Harga_Normal() {
        int total;
        total = (get_jarak() * per_km) + get_kondisi();
        return total;
    }

    public int get_Harga_total() {
        int jumlah;
        jumlah = get_Harga_Normal() - get_diskon();
        return jumlah;
    }

}
