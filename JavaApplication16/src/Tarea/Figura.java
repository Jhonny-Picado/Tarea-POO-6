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
public  abstract class Figura implements Comparable<Figura>{
    
    protected double altura, base; 
            
    public abstract double calcularArea();
    public abstract int numLados();
    
    @Override
    public int compareTo(Figura f){
        double areaPorComparar=f.calcularArea();
        double miArea=this.calcularArea();
        int misLados=this.numLados();
        int ladosOtros= f.numLados();
        
        if (miArea==areaPorComparar){
            if (misLados==ladosOtros)
                return 1;
        }
        
        return 0;
    }
}
