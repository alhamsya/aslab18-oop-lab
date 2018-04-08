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
public class modul {
    
    public void no1(){
        double score1, score2, score3, total, average;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Score ke 1: ");
        score1 = input.nextDouble();
        
        System.out.print("Enter Score ke 2: ");
        score2 = input.nextDouble();
        
        System.out.print("Enter Score ke 3: ");
        score3 = input.nextDouble();
        
        average = (score1 + score2 + score3) / 3;
        
        System.out.println("The average is " + average + "\n");
        
        if (average >= 80) {
            System.out.println("That's a great score\n");
        }
        
        System.out.println("Program Selesai\n");
    }
    
    public void no2(){
        String nama;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name : ");

        nama = input.next();

        System.out.print("NIM (Nomor Induk Mahasiswa) = ");
        switch (nama) {
            case "alham":
                System.out.println("1152001011");
                break;
            case "dezan":
                System.out.println("1152001010");
                break;
            case "bintang":
                System.out.println("1152001009");
                break;
            case "andhika":
                System.out.println("1152001008");
                break;
            default:
                System.out.println("Invalid Input.");

        }
    }
    
    public void no3(){
        int dollar, rupiah;
        String input_dollar;
        DecimalFormat df;
        
        input_dollar = JOptionPane.showInputDialog("Input Dollar");
        
        dollar = Integer.parseInt(input_dollar);
        
        rupiah = dollar * 14285;
        
        df = new DecimalFormat ("Rp #,###");
        
        JOptionPane.showMessageDialog(null, "1 Dollar = Rp 14.285");
        
        JOptionPane.showMessageDialog(null, "Hasil Konfersi Dollar ke "
                + "Rupiah adalah : \n" + 
                df.format(rupiah), "Hasil", JOptionPane.PLAIN_MESSAGE);
    }
    
}
