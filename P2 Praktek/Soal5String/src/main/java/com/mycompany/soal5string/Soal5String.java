/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal5string;

import static java.awt.SystemColor.text;
import java.util.Scanner;

/**
 *
 * @author 7270
 */
public class Soal5String {

    public static void main(String[] args) {
        String a;
        String b;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan kata 1: ");
        a = scanner.nextLine();
        
        System.out.println("Masukkan kata 2: ");
        b = scanner.nextLine();
        
        System.out.println("");
        
        int p1 = a.length();
        int p2 = b.length();
        int pj = p1 + p2;
        
        int lexico = a.compareTo(b);
        String result = null;
        if(lexico < 0){
            result = "No";
        } else if(lexico > 0){
            result = "Yes";
        }
        
        System.out.println(pj);
        System.out.println(result);
        System.out.println(a + " " + b);
        
    }
}
