/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea;

/**
 *
 * @author Usuario
 */
public class Rectangulo extends Figura{
        
    public Rectangulo(double _base, double _altura){
        this.base=_base;
        this.altura=_altura;
    }
    
    @Override
    public double calcularArea() {
        return this.base * this.altura;
    }

    @Override
    public int numLados() {
        return 4;
    }
    
}
