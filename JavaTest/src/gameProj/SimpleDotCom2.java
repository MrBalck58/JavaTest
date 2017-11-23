/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameProj;

/**
 *
 * @author Denis
 */
public class SimpleDotCom2 {
    
    private int[] locationCells;
    private int numOfHits = 0;
    
    public void setLocationCells(int [] locs){
        locationCells =  locs;
    }
    
   public String checkYourSelf(String stringGuess){
        
       int guess = Integer.parseInt(stringGuess);
       String result = "Мимо";
       
       for (int cell:locationCells) {
           
           if (guess == cell){
               
               result  = "Попал";
               numOfHits++;
            break;
           }  
       }
       
       if (numOfHits == locationCells.length){
           result = "Потопил";
       }
       
       System.out.println(result);
       
       return result ;
   }
    
}
