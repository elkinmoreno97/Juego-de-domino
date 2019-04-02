/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino;

import java.util.ArrayList;
/**
 *
 * @author Elkin Moreno y Luis Large
 */
public class Jugador {
     private ArrayList<Ficha> fichas;
     
        public void fichas(){
        fichas = new ArrayList<Ficha>();
        Ficha ficha1 = new Ficha(0,0);
        fichas.add(ficha1);
        Ficha ficha2 = new Ficha(0,1);
        fichas.add(ficha2);
        Ficha ficha3 = new Ficha(0,2);
        fichas.add(ficha3);
        Ficha ficha4 = new Ficha(0,3);
        fichas.add(ficha4);
        Ficha ficha5 = new Ficha(0,4);
        fichas.add(ficha5);
        Ficha ficha6 = new Ficha(0,5);
        fichas.add(ficha6);
        Ficha ficha7 = new Ficha(0,6);
        fichas.add(ficha7);
        Ficha ficha8 = new Ficha(1,1);
        fichas.add(ficha7);
        Ficha ficha9 = new Ficha(1,2);
        fichas.add(ficha9);
        Ficha ficha10 = new Ficha(1,3);
        fichas.add(ficha10);
        Ficha ficha11 = new Ficha(1,4);
        fichas.add(ficha11);
        Ficha ficha12 = new Ficha(1,5);
        fichas.add(ficha12);
        Ficha ficha13 = new Ficha(1,6);
        fichas.add(ficha13);
        Ficha ficha14 = new Ficha(2,2);
        fichas.add(ficha14);
        Ficha ficha15 = new Ficha(2,3);
        fichas.add(ficha15);
        Ficha ficha16 = new Ficha(2,4);
        fichas.add(ficha16);
        Ficha ficha17 = new Ficha(2,5);
        fichas.add(ficha17);
        Ficha ficha18 = new Ficha(2,6);
        fichas.add(ficha18);
        Ficha ficha19 = new Ficha(3,3);
        fichas.add(ficha19);
        Ficha ficha20 = new Ficha(3,4);
        fichas.add(ficha20);
        Ficha ficha21 = new Ficha(3,5);
        fichas.add(ficha21);
        Ficha ficha22 = new Ficha(3,6);
        fichas.add(ficha22);
        Ficha ficha23 = new Ficha(4,4);
        fichas.add(ficha23);
        Ficha ficha24 = new Ficha(4,5);
        fichas.add(ficha24);
        Ficha ficha25 = new Ficha(4,6);
        fichas.add(ficha25);
        Ficha ficha26 = new Ficha(5,5);
        fichas.add(ficha26);
        Ficha ficha27 = new Ficha(5,6);
        fichas.add(ficha27);
        Ficha ficha28 = new Ficha(6,6);
        fichas.add(ficha28);
        }
                
        
    private ArrayList<Ficha> fichasjugador1;
    private ArrayList<Ficha> fichasjugador2;
    private ArrayList<Ficha> fichasjugador3;
    private ArrayList<Ficha> fichasjugador4;

    public void getFichasjugador1() {
        for(Ficha ficha : fichasjugador1){
            System.out.println("["+ ficha.pinta1 + ":" + ficha.pinta2 + "]");
        }
    }

    public void setFichasjugador1(int x) {
        Ficha ficha0 = new Ficha(fichas.get(x).pinta1, fichas.get(x).pinta2);
        fichasjugador1.add(ficha0);
        this.fichasjugador1 = fichasjugador1;
    }

    public void getFichasjugador2() {
          for(Ficha ficha : fichasjugador2){
            System.out.println("["+ ficha.pinta1 + ":" + ficha.pinta2 + "]");
        }    
    }

    public void setFichasjugador2(int x) {
        Ficha ficha0 = new Ficha(fichas.get(x).pinta1, fichas.get(x).pinta2);
        fichasjugador2.add(ficha0);
        this.fichasjugador2 = fichasjugador2;
    }

    public void getFichasjugador3() {
          for(Ficha ficha : fichasjugador3){
            System.out.println("["+ ficha.pinta1 + ":" + ficha.pinta2 + "]");
        }  
    }

    public void setFichasjugador3(int x) {
        Ficha ficha0 = new Ficha(fichas.get(x).pinta1, fichas.get(x).pinta2);
        fichasjugador3.add(ficha0);
        this.fichasjugador3 = fichasjugador3;
    }

    public void getFichasjugador4() {
          for(Ficha ficha : fichasjugador4){
            System.out.println("["+ ficha.pinta1 + ":" + ficha.pinta2 + "]");
        }     
    }

    public void setFichasjugador4(int x) {
        Ficha ficha0 = new Ficha(fichas.get(x).pinta1, fichas.get(x).pinta2);
        fichasjugador4.add(ficha0);
        this.fichasjugador4 = fichasjugador4;
    }
    
    
    
    public boolean pasar(boolean x){
        return x = true;
    }
}
