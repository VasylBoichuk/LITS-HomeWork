package com.company;

public class ASCI {
    public int startCalculation;
    public int finishCalculation;



    public void setStartCalculation(int startCalculation) {
        this.startCalculation = startCalculation;
    }

    public void setFinishCalculation(int finishCalculation) {
        this.finishCalculation = finishCalculation;
    }

    public void printASCI() {
        System.out.print("Символи таблиці ASCI -    ");
        for (int i = startCalculation; i <= finishCalculation; i++) {
            System.out.print((char) i + " ");
        }
    }
}