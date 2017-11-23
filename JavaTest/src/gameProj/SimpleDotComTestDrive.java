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
public class SimpleDotComTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SimpleDotCom2 dot = new SimpleDotCom2();
        
        int [] locations = {2,3,4};
        
        dot.setLocationCells(locations);
        
        String userGuess = "3";
        String result = dot.checkYourSelf(userGuess);
        String testResult = "Мимо";
        if (result.equals("Попал")){
        
            testResult = "Пройден";
    }
    
        System.out.println(testResult);    
    }
    
}
