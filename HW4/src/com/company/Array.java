package com.company;

import java.util.Random;

public  class Array {
    public int array[] =new int[10];

    public int[] getPositivArray () {
        int counter = 1;
        for (var i = 0; i < 10; i++) {
            if (counter % 2 == 0) {
                array[i] = counter;
                counter++;
            } else {
                counter++;
                array[i] = counter;
                counter++;
            }
        }
        return array;
    }

    public int[] getRandomArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt();
        }
       return array ;
    }

    public int getAverageValue() {
        int averageValue = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        averageValue =sum / array.length;
        return  averageValue ;

    }
    public int getMaxValue() {
        int max = array[0];


        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return  max;
    }

    public int getMinValue() {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }
        }
        return  min;
    }
    public void printPosValue() {
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0) {
                System.out.println(array[i]);
            }
        }
    }


    public void  printArray () {
        this.array = array;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
}