/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge;

import java.util.Scanner;

/**
 *
 * @author ASUS GAMING PC
 */
public class challenge2 {
    public static void main(String[] args){
        Scanner mahal = new Scanner(System.in);
        double nilaiakhir;
        double nilaiTugasharian;
        double nilaiLaporan;
        double nilaiUjian;
        
        System.out.println("======NILAI AKHIR SISWA=======");
        System.out.print("nilai tugas :");
        double nilaitugas = mahal.nextDouble();
        nilaiTugasharian = nilaitugas * 30 / 100;
        System.out.println("Nilai Tugas Harian :" + nilaiTugasharian);
        System.out.print("nilai laporan :");
        double nilailaporan = mahal.nextDouble();
        nilaiLaporan = nilailaporan * 0.2;
        System.out.println("Nilai Laporan :" + nilaiLaporan);
        System.out.print("nilai ujian :");
        double nilaiujian = mahal.nextDouble();
        nilaiUjian = nilaiujian * 0.5;
        System.out.println("Nilai Ujian :" + nilaiUjian);
        nilaiakhir = nilaiTugasharian + nilaiLaporan + nilaiUjian;
        System.out.println("Nilai Akhir :" + nilaiakhir);
        
        if(nilaiakhir <= 40){
            System.out.println("F");
            System.out.println("Anda tidak lulus, tingkatkan belajar anda");
                    
        }else if(nilaiakhir > 40 && nilaiakhir <= 55){
            System.out.println("E");
            System.out.println("Anda tidak lulus, tingkatkan belajar anda");
            
        }else if(nilaiakhir < 55 && nilaiakhir <= 74){
            System.out.println("D");
            System.out.println("Anda tidak lulus, tingkatkan belajar anda");
            
        }else if(nilaiakhir > 74 && nilaiakhir <= 85){
            System.out.println("C");
            System.out.println("Anda lulus dengan cukup, tingkatkan lagi prestasimu");
            
        }else if(nilaiakhir > 85 && nilaiakhir <= 92){
            System.out.println("B");
            System.out.println("Anda lulus dengan baik, pertahankan prestassimu");
            
        }else if(nilaiakhir > 92 && nilaiakhir <= 100){
            System.out.println("A");
            System.out.println("Anda lulus, Excellent");
        }
        
        
    }
    
}
