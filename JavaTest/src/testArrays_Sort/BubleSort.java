/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testArrays_Sort;

import java.util.Arrays;

/**
 *
 * @author Denis
 */
public class BubleSort {
    //int [] arr;//input array
    
    
//    int[] getArray(){
//        return arr;
//    }
    
    public void buble(int [] arr){
        for (int i = arr.length-1; i>0; i--){
            for (int j = 0; j<i; j++){
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr [j+1];
                    arr[j+1] = tmp;
                    
                }
                
            }
            
        }
        System.out.println(Arrays.toString(arr));
        
    }
    
}
