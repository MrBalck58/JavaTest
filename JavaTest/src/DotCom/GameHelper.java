/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DotCom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Denis
 */

public class GameHelper {
    private static final String alphabet = "abcdefg";
    private int gridLenght = 7;
    private int gridSize = 49;
    private int [] grid = new int [gridSize];
    private int comCount = 0;
    
    public String getUserInput (String prompt){
        String inputLine =null;
        System.out.print(prompt + "  ");
        
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException:" + e);
            
        }
        return inputLine.toLowerCase();
    }
    
            public ArrayList <String> placeDotCom(int comSize) { 
                ArrayList <String> alphaCells = new ArrayList <String>(); 
                String [] alphacoords = new String [comSize];       // Хранит координаты типа f6 
                String temp = null; // Временная строка для конкатенации 
                int [] coords = new int[comSize]; // Координаты текущего "сайта" 
                int attempts =0; // Счетчик текущих попыток 
                boolean success = false; // Нашли подходящее местоположение? 
                int location =0; // Текущее начальное местоположение 
                
                comCount++; 
                int incr = 1; 
                if ((comCount % 2) == 1) {
                incr = gridLenght; 
                }

            while ( !success & attempts ++ < 200 ) { 
                location = (int) (Math.random() * gridSize); 
                int x = 0; 
                success = true; 
                
                while (success && x < comSize) { 
                    if (grid[location] == 0) { 
                    coords[x++] = location; 
                    location += incr; 
                    if (location >= gridSize){ 
                    success = false; 
                    } 
                    if (x>0 && (location % gridLenght ==0)) { // Вышли за рамки - правый край 
                    success = false; // Неудача 
                    } 
                    } else { // Нашли уже использующееся местоположение 
                    // Syste®.cut.print ("используется™ + location); 
                    success = false; // Неудача 
                } 
            } 
// Конец while 

            }
                int x = 0; 
                int row = 0; 
                int column = 0; 

                while (x < comSize) { 
                grid[coords[x]] = 1; 
                row = (int) (coords[x] / gridLenght); 
                column = coords[x] % gridLenght; 
                temp = String.valueOf(alphabet.charAt(column)); 
                alphaCells.add(temp.concat(Integer.toString(row))); 
                x++; 
                }
                return alphaCells; 
    }
}
