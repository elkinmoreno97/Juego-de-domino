/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino;

/**
 *
 * @author Elkin Moreno y Luis Large
 */
public class Ficha {
    int pinta1;
    int pinta2;

    public Ficha(int pinta1, int pinta2) {
        this.pinta1 = pinta1;
        this.pinta2 = pinta2;
    }
    
    /**
     *
     * @return
     */
    public int getPinta1() {
        return pinta1;
    }

    public void setPinta1(int pinta1) {
        this.pinta1 = pinta1;
    }

    public int getPinta2() {
        return pinta2;
    }

    public void setPinta2(int pinta2) {
        this.pinta2 = pinta2;
    }
}
