/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animals;

/**
 *
 * @author Denis
 */
public class Cat extends  Pet {
    int wight ;
    String color;
    
    public Cat (final String name) {
        super(name);
    } 
    public void CatchMouse(){
        
    }
    
//       
    @Override
      public void makeSound (String sound){
             System.out.println(sound+" мяу");
       }
    
}
