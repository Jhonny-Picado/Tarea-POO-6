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
public class Pruebas {
    
    public static void main(String []args){
        
        Triangulo t= new Triangulo(3,5.5);
        System.out.println("Area del triangulo es: "+ t.calcularArea());
        System.out.println("Numero de lados: "+t.numLados());
        
        Rectangulo r= new Rectangulo(8,9);
        System.out.println("Area del rectangulo es: "+ r.calcularArea());
        System.out.println("Numero de lados: "+r.numLados());
        
        Circulo c= new Circulo(5);
        System.out.println("Area del ciculo es: "+ c.calcularArea());  
        System.out.println("Numero de lados: "+c.numLados());
        
        Rectangulo r1 = new Rectangulo(7.2,10);
        System.out.println(r.compareTo(r1));
        
    }
}
