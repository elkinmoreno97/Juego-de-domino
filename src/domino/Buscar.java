/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino;

import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author 10
 */
public class Buscar {
    int[] usadas = new int[28];
    int tope = 0, i = 0;
    
    public int disponible(int x){
        i = 0;
        while (i < tope) {
            if(usadas[i] == x){
                x = (int) (Math.random()*28);
                i = 0;
            }
            else{
                i++;
            }
        }
        usadas[tope] = x;
        tope++;
        
        return x;
    }
}
