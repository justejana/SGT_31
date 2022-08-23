package oop.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListInterfaceExample2 {
    public static void main(String[] args) {

        //Example 1
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("List 1: " + list);

        ArrayList<Integer>list2 = new ArrayList<>();
        list2.addAll(list);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        System.out.println("List2: " + list2);

        //Example 2
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add("Test 1");
        arraylist.add("Test 2");
        arraylist.add("Test 3");

        for(int i = 0; i < arraylist.size(); i++){
        System.out.print(arraylist.get(i) + " ");
        }
        System.out.println();
        for(String str: arraylist){
        System.out.print(str + " ");
        }
        System.out.println();

        //Linked List
        LinkedList<String> car = new LinkedList<>();
        car.add("Volvo");
        car.add("Mercedes");
        car.add("BMW");
        car.add("Jeep");
        car.add("Opel");
        System.out.println(car);
        System.out.println(car.getLast());

        // Create a new LinkedList object
        // Populate the list with numbers from 1 to 100
        // Print all the elements in the LinkedList


        LinkedList<Integer> numbers = new LinkedList<>();
        for(int i = 1; i <= 100; i++){
        numbers.add(i);}

        System.out.println(numbers);



    }
}
