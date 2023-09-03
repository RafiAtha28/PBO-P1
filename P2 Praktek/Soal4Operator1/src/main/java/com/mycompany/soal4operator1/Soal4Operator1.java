/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal4operator1;

/**
 *
 * @author 7270
 */
public class Soal4Operator1 {

    static short methodOne(long l){
        int i = (int) l;
        return (short)i;
    }

    public static void main(String[] args) {
        double d = 10.25;
        float f = (float) d;
        byte b = (byte) methodOne((long) f);
        System.out.println(b); 
    }
}
