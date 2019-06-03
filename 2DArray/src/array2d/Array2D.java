/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2d;

import java.util.Random;

/**
 *
 * @author thomasbriggs
 */
public class Array2D {
    
    static final int ROWS = 6;
    static final int COLUMNS = 3;
    
    
    static Random rand = new Random();
    static int[][] salesArray = new int[ROWS][COLUMNS]; //6 rows & 3 columns

    public static void display2DArray(){
        
        System.out.println("-------------------------------------------------");

        // Output the array contents to the console window
        //declare loop variables using standard notation
        int i; // loops through the number of rows
        int j; // loops through the number of columns
        // Outer loop loops through each row..
        for (i = 0; i < 6; i++){
        // .. inner loop loops through each column of that row..
            for (j = 0; j < 3; j++){
                // print the value of that array item at(i,j)
                System.out.print("|\t"+salesArray[i][j]+"\t");
            }
            System.out.println("|"); // new line
            System.out.println("-------------------------------------------------");
        }
    }

    public static void init2DArray(){

        // Output the array contents to the console window
        //declare loop variables using standard notation
        int i; // loops through the number of rows
        int j; // loops through the number of columns
        // Outer loop loops through each row..
        for (i = 0; i < 6; i++){
        // .. inner loop loops through each column of that row..
            for (j = 0; j < 3; j++){
                // print the value of that array item at(i,j)
                salesArray[i][j] = 0;
            }
        }
    }
    
    public static void populate2DArray(){

        // Output the array contents to the console window
        //declare loop variables using standard notation
        int i; // loops through the number of rows
        int j; // loops through the number of columns
        // Outer loop loops through each row..
        for (i = 0; i < 6; i++){
        // .. inner loop loops through each column of that row..
            for (j = 0; j < 3; j++){
                // print the value of that array item at(i,j)
                salesArray[i][j] = rand.nextInt(999);
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        init2DArray();
        populate2DArray();
        display2DArray();
        System.out.println(salesArray[5][1]);
    }
    
}
