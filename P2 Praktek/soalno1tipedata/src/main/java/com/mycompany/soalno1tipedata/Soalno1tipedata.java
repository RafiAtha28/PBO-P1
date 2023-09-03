/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soalno1tipedata;

import java.util.Scanner;
import java.math.BigInteger;

/**
 *
 * @author 7270
 */
public class Soalno1tipedata {

    public static void main(String[] args) {
        String input; // Input untuk angka yang akan di cek
        String input2; // Input untuk perulangan
        int p; 
        short short_max = Short.MAX_VALUE; 
        short short_min = Short.MIN_VALUE;
        int int_max = Integer.MAX_VALUE;
        int int_min = Integer.MIN_VALUE;
        long long_max = Long.MAX_VALUE;
        long long_min = Long.MIN_VALUE;
        
        p = 1;
        Scanner scanner = new Scanner(System.in);
        while(p == 1) {
            System.out.println("Masukkan angka: "); 
            input = scanner.nextLine(); //mengambil value dari inputtan
            // variabel a bertipe big integer untuk pengecekkan agar bisa lebih besar dari tipe data primitif
            BigInteger a = new BigInteger(input); 
            
            System.out.println(a + " Can Be Fitted In:");
            if (a.compareTo(BigInteger.valueOf(short_max)) <= 0 && a.compareTo(BigInteger.valueOf(short_min)) >= 0) {
                System.out.println("* Short");
            }
            if (a.compareTo(BigInteger.valueOf(int_max)) <= 0 && a.compareTo(BigInteger.valueOf(int_min)) >= 0) {
                System.out.println("* Int");
            }
            if (a.compareTo(BigInteger.valueOf(long_max)) <= 0 && a.compareTo(BigInteger.valueOf(long_min)) >= 0) {
                System.out.println("* Long");
            } else {
                System.out.println(a + " Can't Be Fitted Anywhere");
            }
     
            System.out.println("Apakah ingin melakukan pengecekkan lagi?(1 = Ya, 2 = Tidak): ");
            input2 = scanner.nextLine();     
            p = Integer.parseInt(input2);
            System.out.println("");
        }
    }
}
