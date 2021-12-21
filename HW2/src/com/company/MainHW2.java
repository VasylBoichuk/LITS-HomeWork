package com.company;

import java.util.Random;

public class MainHW2 {


    public static void main(String[] args) {
        // Mas1
        System.out.println("Work 1");
        int[] m = new int[10];
        int i = 0;
        for (var k = 1; k <= 20; k++) {
            if (k % 2 == 0) {
                m[i] = k;
                System.out.println(m[i]);
            }
        }
        // Mas2
        Random Random = new Random();
        System.out.println();
        System.out.println("Work 2");
        int [] m2 = new int[10];
        for ( int i2=0; i2< m2.length; i2++){
            m2[i2] = Random.nextInt();
            System.out.println(m2[i2]);
        }
        int sum = 0;
        int max = m2[0];
        int min = m2[0];
        for (int i3=0; i3< m2.length; i3++) {
            sum += m2[i3];
            if (m2[i3] > max) {
                max = m2[i3];
            }
            if (m2[i3] < min) {
                min = m2[i3];
            }
        }
        int sz= sum/ m2.length;
        //p3
        System.out.println("Середнє значення - " + sz);
        System.out.println("MAX значення - " + max);
        System.out.println("MIN значення - " + min);
        System.out.print("Парні елементи - ");
        for (int i4 = 0; i4 < m2.length; i4++) {
            if ((m2[i4] % 2) == 0) {
                System.out.print(m2[i4] + "  ");
            }
        }
        System.out.println("");
        System.out.print("Перші 20 символів таблиці ASCI -    ");
        for (int i5 = 33; i5 <= 53; i5++) {
            System.out.print((char) i5+" ");
        }
    }
}
