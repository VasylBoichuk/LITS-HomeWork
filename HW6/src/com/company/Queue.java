package com.company;
import java.util.LinkedList;


public class Queue {
        private LinkedList<Integer> list;

    public Queue(){
        list = new LinkedList();
    }

    public int addElement(int addToList){
        list.add(addToList);
        return addToList;
    }
    public void printList(){
        for(int elemList : list){
            System.out.print(elemList + " ");
        }
        System.out.println();
    }
    public void printLastElement(){
   int lastElement = list.get(list.size()-1);
        System.out.println("Останній доданий елемент- " + lastElement);
    }

}
