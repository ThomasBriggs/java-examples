/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author thomasbriggs
 */
public class Main {
    
    static Scanner scanner = new Scanner(System.in);
    
    static Random rand = new Random();
    
    public static int random(int min, int max) {
        return rand.nextInt((max+1)- min)+min;
    }

    public static void populateRandom(int[] list, int numOfRandom){
        for (int i = 0; i < list.length; i++){
            list[i] = rand.nextInt(numOfRandom);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        Sort sort = new Sort();
        int[] sortMe = new int[random(5, 20)];
        

        populateRandom(sortMe, 50);
        System.out.println(Arrays.toString(sortMe));
        sort.insertionSort(sortMe);
        System.out.println(Arrays.toString(sortMe));
        double num = 14.4535;
        System.out.println(num %0.2D);
    }
    
}
