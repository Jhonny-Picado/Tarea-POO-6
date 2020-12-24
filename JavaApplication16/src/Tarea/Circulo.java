/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea;

/**
 *
 * @author Jhonny Picado Vega
 */
public class Circulo extends Figura{
    
    private double radio;
    
    public Circulo(double _radio){
       this.radio=_radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI*Math.pow(this.radio, 2);
    }
    
    @Override
    public int numLados() {
        return 0;
    }
}
