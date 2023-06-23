/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.algo.project;

import java.util.*;
public class FinalSolution1 {
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //make an arraylist to store the slice's number 
        ArrayList<Integer> slice = new ArrayList<>(30);
        System.out.println("Enter the numbers of the travelers ");
        int number = input.nextInt();
        // store the size of each slice
        System.out.println("Enter all the sizies of the pizza slides ");

        for (int i = 0; i < number; i++) {
            slice.add(input.nextInt());
        }
        // sort the size into increasing order

        insertionSort(slice);

        // determine whether that each traveler is happy or not 
        boolean flag = true;
       int max = slice.get(slice.size() - 1);
        if (max < number) {
            flag = false;
        }
        for (int i = 1; i <= slice.size() && flag; i++) {

            if (slice.get(i - 1) >= i) {

                flag = true;

            } else {

                flag = false;

                break;
            }
        }

        if (flag) {
            System.out.println(" it is possible to distribute the slices and every one is Happy ");
        } else {

            System.out.println("it is not possible to distribute the slices and not every one is Happy");
        }
    }

    public static <T extends Comparable<T>> void insertionSort(ArrayList<T> data) {

        for (int i = 1; i < data.size(); i++) {

            T currentElement = data.get(i);
            int k;

            for (k = i - 1; k >= 0 && data.get(k).compareTo(currentElement) > 0; k--) {
                data.set(k + 1, data.get(k));
            }

            // Insert the current element into list[k + 1]
            data.set(k + 1, currentElement);
        }
    }
}
