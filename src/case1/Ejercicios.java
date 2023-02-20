/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package case1;

import java.util.Random;

/**
 *
 * @author Soporte-Bts
 */
public class Ejercicios {
    
      public static void main(String[] args) {
          
              Random random = new Random();

        char randomizedCharacter = (char) (random.nextInt(26) + 'a');
        System.out.println("Generated Random Character: " + randomizedCharacter);
      }
    
}
