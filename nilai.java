/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apapunitu;

import javax.swing.JOptionPane;

/**
 *
 * @author MOKLET010
 */
public class nilai {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Masukkan nama siswa: ");
        int nilai = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai dari " +nama));
        String predikat = null,kategori = null;
        
        if(nilai > 95 && nilai <= 100){
            predikat = "A";
            kategori = "Sangat Baik";
        } else if(nilai > 90 && nilai <= 95){
            predikat = "A-";
            kategori = "Sangat Baik";
        } else if(nilai > 85 && nilai <= 90){
            predikat = "B+";
            kategori = "Baik";
        } else if(nilai > 80 && nilai <= 85){
            predikat = "B-";
            kategori = "Baik";
        } else if(nilai > 74 && nilai <= 80){
            predikat = "B";
            kategori = "Baik";
        } else if(nilai > 69 && nilai <= 74){
            predikat = "C+";
            kategori = "Cukup";
        } else if(nilai > 64 && nilai <= 69){
            predikat = "C";
            kategori = "Cukup";
        } else if(nilai > 59 && nilai <= 64){
            predikat = "C-";
            kategori = "Cukup";
        } else if(nilai > 54 && nilai <= 59){
            predikat = "D+";
            kategori = "Kurang";
        } else if(nilai > 0 && nilai <= 54){
            predikat = "D";
            kategori = "Kurang";
        }
        
        JOptionPane.showMessageDialog(null, "Nama: "+nama+"\nNilai: "+nilai+"\nPredikat: "+predikat+"\nKategori: "+kategori);
    }       
}
