/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 10
 */
public class Repartir {
    private ArrayList<Ficha> fichas;
    private ArrayList<Jugador> jugadores;
    private ArrayList<Ficha> fichasjugador1;
    private ArrayList<Ficha> fichasjugador2;
    private ArrayList<Ficha> fichasjugador3;
    private ArrayList<Ficha> fichasjugador4;
    private int op, global;

    public ArrayList<Ficha> getFichas() {
        return fichas;
    }

    public void setFichas(ArrayList<Ficha> fichas) {
        this.fichas = fichas;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<Ficha> getFichasjugador1() {
        return fichasjugador1;
    }

    public void setFichasjugador1(ArrayList<Ficha> fichasjugador1) {
        this.fichasjugador1 = fichasjugador1;
    }

    public ArrayList<Ficha> getFichasjugador2() {
        return fichasjugador2;
    }

    public void setFichasjugador2(ArrayList<Ficha> fichasjugador2) {
        this.fichasjugador2 = fichasjugador2;
    }

    public ArrayList<Ficha> getFichasjugador3() {
        return fichasjugador3;
    }

    public void setFichasjugador3(ArrayList<Ficha> fichasjugador3) {
        this.fichasjugador3 = fichasjugador3;
    }

    public ArrayList<Ficha> getFichasjugador4() {
        return fichasjugador4;
    }

    public void setFichasjugador4(ArrayList<Ficha> fichasjugador4) {
        this.fichasjugador4 = fichasjugador4;
    }

    public int getGlobal() {
        return global;
    }
    
    
    
    public void generar(){
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
    public void empezar(){
         Scanner leer = new Scanner(System.in);
         System.out.println("Numero de JUGADORES: ");
             int num = leer.nextInt();
             if ((num < 2) || (num > 4)) {
                 System.out.println("NO SE PUEDE JUGAR CON MENOS DE 2 JUGADORES O MAS DE 4");
             } else {
                 
                 jugadores = new ArrayList<Jugador>();
            
                 for (int i = 1; i <= num; i++) {
                     Jugador jugador0 = new Jugador();
                     jugadores.add(jugador0);
                 }
                 
                 int cant = 28/jugadores.size();
                 int aleatorio;
                 aleatorio = (int) (Math.random()*28);
                 global = cant;
                 Buscar darfichas = new Buscar();
                 int x;
                 
                 fichasjugador1 = new ArrayList<Ficha>();
                 fichasjugador2 = new ArrayList<Ficha>();
                 fichasjugador3 = new ArrayList<Ficha>();
                 fichasjugador4 = new ArrayList<Ficha>();
                 int i = 1;
                 while ( i <= jugadores.size()) {
                         int j = 0;
                     while ( j < cant) {
                         x = darfichas.disponible(aleatorio);
                         if(i == 1){ 
                             Ficha ficha = new Ficha(fichas.get(x).pinta1, fichas.get(x).pinta2);
                             fichasjugador1.add(ficha);
                         }
                         else if(i == 2){
                             Ficha ficha0 = new Ficha((fichas.get(x).pinta1), (fichas.get(x).pinta2));
                             fichasjugador2.add(ficha0);
                         }
                         else if(i == 3){
                             Ficha ficha0 = new Ficha((fichas.get(x).pinta1), (fichas.get(x).pinta2));
                             fichasjugador3.add(ficha0);
                         }
                         else{
                             Ficha ficha0 = new Ficha((fichas.get(x).pinta1), (fichas.get(x).pinta2));
                             fichasjugador4.add(ficha0);
                         }
                         j++;
                     }
                     i++;
                 } 
             }
             for (int i = 1; i <= jugadores.size(); i++) {
                 System.out.println("Fichas de Jugador "+i+" :");
                 for (int j = 0; j <= fichasjugador1.size()-1; j++) {
                if (i == 1) {
                    System.out.println("["+fichasjugador1.get(j).pinta1+":"+fichasjugador1.get(j).pinta2+"]");
                } 
                else if (i == 2){
                    System.out.println("["+fichasjugador2.get(j).pinta1+":"+fichasjugador2.get(j).pinta2+"]");
                }
                else if (i == 3){
                    System.out.println("["+fichasjugador3.get(j).pinta1+":"+fichasjugador3.get(j).pinta2+"]");
                }
                else{
                    System.out.println("["+fichasjugador4.get(j).pinta1+":"+fichasjugador4.get(j).pinta2+"]");
                }
            }
        }
             
         }
    public void Mesa(){
        for (Jugador jugador : jugadores) {
            for (Ficha ficha : fichas) {
                jugador.getFichasjugador1();
            }
        }
    }
}
