/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qs;

import java.util.Arrays;

/**
 *
 * @author bri16827755
 */
public class Qs {

    /**
     * @param args the command line arguments
     */
    
    public static void quickSort(int first, int last, int[] sortme){
        if (last > first){
            int left = first;
            int right = last;
            int pivot = sortme[(first + last)/2];
            
            do{
            
                while (sortme[left] < pivot){
                    left = left + 1;
                }

                while (sortme[right] > pivot){
                    right = right - 1;

                }

                int temp = sortme[left];
                sortme[left] = sortme[right];
                sortme[right] = temp;
                
            } while(left != right);
            
            quickSort(first, left-1, sortme);
            quickSort(right+1, last, sortme);
        }
    }
    
    public static void main(String[] args) {
        int[] test = {5, 7, 3, 72, 2, 88, 33, 89, 56};
        System.out.println("Before:" + Arrays.toString(test));
        quickSort(0, 8, test);
        System.out.println("After:" + Arrays.toString(test));
    }
    
}
