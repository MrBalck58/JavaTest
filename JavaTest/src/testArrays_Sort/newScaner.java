/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testArrays_Sort;


import java.util.Scanner;

/**
 *
 * @author Denis
 */
public class newScaner {
    //int[] war1;
  
     public int [] ScanText(){
       int x = 0;
       int[] arr;
       
       
        Scanner reader = new Scanner(System.in);
         
        System.out.println("Введите размер массива");
         int j = Integer.valueOf(reader.next());
         
          
          arr = new int[j];
          
          while ( x < j) {
           System.out.println("Введите "+ x + " переменную");
           arr[x] = Integer.valueOf(reader.next());
           
           x=x+1; 
         }
        
           
           return arr;
    }
   

 

}
