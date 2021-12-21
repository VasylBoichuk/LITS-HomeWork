package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainHW6 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 15, 48, 74);
        List<Integer> div2List = new ArrayList<>();
        List<Integer> dontDiv2List = new ArrayList<>();
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) % 2 == 0) {
                div2List.add(integerList.get(i));
            } else dontDiv2List.add(integerList.get(i));
        }

        System.out.println("Парні числа list - " + div2List);
        System.out.println("Непарні числа list - " + dontDiv2List);

        Random random = new Random(integerList.size());
        ArrayList<Integer> randomList = new ArrayList();
        for (int i = 0; i < integerList.size(); i++) {
            int next = random.nextInt(10);
            randomList.add(next);
        }
        System.out.println("List рандомних значень " + randomList); //
        System.out.print("List значень   ");
        Queue addList = new Queue();
        int Element3 = addList.addElement(15);
        int Element1 = addList.addElement(5);
        int Element2 = addList.addElement(10);
        addList.printList();
        addList.printLastElement();

    }
}
