package sorting;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author thomasbriggs
 */
public class Sort {
    
    public void bubbleSort(int[] input, boolean inverse){
        int temp;
        for (int i = 0; i < input.length-1; i++){
            for (int j = 0; j < input.length-1-i; j++){
                if (inverse){
                    if (input[j] < input[j+1]){
                        temp = input[j];
                        input[j] = input[j+1];
                        input[j+1] = temp;
                    }
                }else{
                    if (input[j] > input[j+1]){
                        temp = input[j];
                        input[j] = input[j+1];
                        input[j+1] = temp;
                    }   
                }
            }
        }
    }
    
    public void bubbleSort(int[] input){
        bubbleSort(input, false);
    }
    
    public void bubbleSortV2(int[] sorted){
        int n = sorted.length;
        boolean flag;
        do{
            flag = false;
            for (int i= 0; i < n-1; i++){
                if (sorted[i] > sorted[i+1]){
                    int temp = sorted[i];
                    sorted[i] = sorted[i+1];
                    sorted[i+1] = temp;
                    flag = true;
                }
            }
            n -=1;
        }while(flag == true && n > 0);
    }
    
    public void insertionSort(int [] input){
        int n = input.length;
        int j;
        for (int i = 1; i<n; i++){
            j = i;
            int temp = input[i];
            while (j > 0 && input[j-1] > temp) {
                input[j] = input[j-1];
                j--;
            }
            input[j] = temp;
                
        }
    }
}