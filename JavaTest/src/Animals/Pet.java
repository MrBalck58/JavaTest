/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animals;

/**
 *
 * @author  Denis
 */
public class Pet {
    
   public String name;
   public String type; // Собака или кот

      public void makeSound (String sound){
             System.out.println(sound);
       } 
   
   protected Pet(final String name){
       this.name=name;
   }
   }

