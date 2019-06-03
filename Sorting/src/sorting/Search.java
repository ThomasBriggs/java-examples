/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Arrays;

/**
 *
 * @author thomasbriggs
 */
public class Search {
    
    public void intSearch(int[] list, int itemSearch){
        boolean itemFound;
        int i = 0;
        itemFound = false;
        
        do{
            if (list[i] == itemSearch){
                itemFound = true;
            }else{
              i++;  
            }            
        }while(i < list.length && itemFound == false);
        
        if (itemFound == true) {
            System.out.println("Item was found at index: " + i);
        }else{
            System.out.println("Item was not in the list");
        }
    }
    
    public void intSearchV2(int[] list, int item){
        boolean itemFound = false; 
        for (int i = 0; i < list.length; i++){
            if (list[i] == item){
                itemFound = true;
                System.out.println("Item was found at index: " + i);
                break;
            }
        }
        if (!itemFound){
            System.out.println("Item was not in the list");
        }
    }
    
    public void binarySearch(int[] list, int item){
        
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        
        int first = 0;
        int last = list.length-1;
        int mid;
        boolean foundIt = false;
        
        do{
            
           mid = (first + last) / 2;
           
           if(list[mid] == item){
               foundIt = true;
               System.out.println(mid);
           }
           if (item < list[mid] ){
               last = (mid-1);
           }else{
               first = (mid +1);
           }
        }while(foundIt == false && last > mid);
        
        if (foundIt){
            System.out.println("Item was found at index: " + mid);
        }else{
            System.out.println("Item was not in the list");
        }
        
    }
    
}
