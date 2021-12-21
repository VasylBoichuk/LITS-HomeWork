package com.company;

import java.util.Arrays;

public class MainHW4 {


    public static void main(String[] args) {
        //array1
        System.out.println("Positiv massif");
        var positivNumersList = new Array();
        positivNumersList.getPositivArray();
        System.out.println(Arrays.toString(positivNumersList.getPositivArray()));
        System.out.println("Random massif");
        var randomNumersList = new Array();
        randomNumersList.getRandomArray();
        System.out.println(Arrays.toString(randomNumersList.array));
        //Середнє значення
        System.out.println("Середнє значення - " + randomNumersList.getAverageValue());
        //Максимальне значення
        System.out.println("Максимальне значення- " + randomNumersList.getMaxValue());
        //Максимальне значення
        System.out.println("Мінімальне значення- " + randomNumersList.getMinValue());
        //Парні елементи масиву
        System.out.println("Парні елементи- ");
        randomNumersList.printPosValue();
        //20 символів із таблиці ASCI
        var asci = new ASCI();
        asci.setStartCalculation(32);
        asci.setFinishCalculation(52);
        asci.printASCI();
    }
}
