/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Alhamsya
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int jarak;
        int kondisi;

        DecimalFormat df;
        Scanner input;

        input = new Scanner(System.in);

        System.out.print("Masukan jarak yang ditempuh ? ");
        jarak = input.nextInt();

        System.out.println("Pilih Kondisi ? \n"
                + "1) Biasa\n"
                + "2) Sore\n"
                + "3) Hujan");
        System.out.print("Pilih kondisi : ");

        kondisi = input.nextInt();
        df = new DecimalFormat("Rp #,###");

        diskon perhitungan;

        perhitungan = new diskon(jarak, kondisi);

        System.out.println("\nHarga normal anda : " + df.format(perhitungan.get_Harga_Normal()));
        System.out.println("Diskon yang anda dapatkan : " + df.format(perhitungan.get_diskon()));
        System.out.println("Harga yang harus anda bayar : " + df.format(perhitungan.get_Harga_total()));

    }

}
