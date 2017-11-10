/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animals;

import java.util.Scanner;

/**
 *
 * @author Denis
 */
public class HomePets {
    
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        Cat vasya = new Cat("vasia");
        
//        vasya.name = "Vasia";
        vasya.type = "Cat";
        vasya.wight = 100;
        
         vasya.makeSound("мяу");
         
         System.out.println(vasya.name+" "+vasya.type+" Вес:"+vasya.wight);
        System.out.println(vasya.getClass().getName());
    }
}
