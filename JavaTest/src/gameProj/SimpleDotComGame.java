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
public class SimpleDotComGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int numOfGuesses = 0;
        
        GameHelper helper = new GameHelper();
        
        SimpleDotCom2 theDotCOm = new SimpleDotCom2();
        
        int randomNum = (int) (Math.random() * 5);
        
        int [] locations = {randomNum, randomNum+1, randomNum+2};
        
        theDotCOm.setLocationCells(locations);
        
        boolean isAlive = true;
        
        String guess = helper.getUserInput("Введите число");
        
        String result = theDotCOm.checkYourSelf(guess);
        
        numOfGuesses++;
        
        if (result.equals("Потопил")){
            isAlive = false;
            System.out.println("Вам потребовалось"+numOfGuesses + "ппыток");
        }
        
        
    }
    
}
