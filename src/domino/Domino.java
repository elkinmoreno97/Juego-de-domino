/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino;

import java.util.Scanner;
/**import java.util.logging.Level;
import java.util.logging.Logger;

/**

/**
 *
 * @author Elkin Moreno y Luis Large
 */
public class Domino {

    public static void main(String[] args){
     
            Repartir nuevo = new Repartir();
            
            System.out.println("MENU");
            System.out.println("1. Generar fichas, Repartirlas y Mostrar Fichas por Jugador.");
            System.out.println("2. Jugar.");
            System.out.println("3. Salir.");
            Scanner leer = new Scanner(System.in);
            int num = leer.nextInt();
            
            switch(num){
                case 1: nuevo.generar(); nuevo.empezar(); main(args);
                case 2: nuevo.Mesa();
                case 3: break;
                default: break;
                }
            }
    
}
