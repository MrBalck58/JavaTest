/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DotCom;


import java.util.ArrayList;

/**
 *
 * @author Denis
 */

 
    import java.security.PrivateKey;
    import java.util.*;

public class DotComBust {
    
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;
    
    private void setUpGame (){
        DotCom one = new DotCom();
        one.setName ("Pets.com");
        DotCom two = new DotCom();
        two.setName ("eToy.com");
        DotCom three = new DotCom();
        three.setName ("Go2.com");
        
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);
        
        System.out.println("Ваша цель - потопить три сайта ");
        System.out.println("Pets.com, eToy.com, Go2.com");
        System.out.println("Попытайтесь сделать это за минимальниое колличество ходов");
        
        for (DotCom dotComToset : dotComList) {
            ArrayList <String> newLocation = helper.placeDotCom(3);
            dotComToset.setLocationCells(newLocation);
        }       
    }
    
    private void startPlaying(){
        while (!dotComList.isEmpty()) {
            String  userGuess = helper.getUserInput("Сделай ход");
            checkUserGuess(userGuess);
        }
       finishGame();
    }
    
    private void checkUserGuess (String userGuess){
        
        numOfGuesses++;
        String result = "Мимо";
        
        for (DotCom dotComToTest : dotComList) {
            result = dotComToTest.checkYourself(userGuess);
            
            if (result.equals("Попал")){
                break;
            }
            if (result.equals("Потопил")){
                dotComList.remove(dotComToTest);
                break;
            }
        }
        
        System.out.println(result);
    }
    private void finishGame(){
        
        System.out.println("Все сайты потоплены!");
        if (numOfGuesses <= 18){
            System.out.println("Это заняло у вас" + numOfGuesses + "попыток.");
        } else{
            System.out.println("Это заняло у вас довольно много времени" + numOfGuesses + "попыток");
            
        }
    }
    
    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
        
    }
    
}

