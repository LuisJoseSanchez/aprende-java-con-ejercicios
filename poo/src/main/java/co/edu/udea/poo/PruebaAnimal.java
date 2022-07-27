/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udea.poo;

/**
 *
 * @author Julian
 */
public class PruebaAnimal {
    public static void main(String[] args) {
    
    Gato garfield = new Gato(Sexo.MACHO, "romano");
    Gato tom = new Gato(Sexo.MACHO);
    Gato lisa = new Gato(Sexo.HEMBRA);
    Gato silvestre = new Gato();
    
    System.out.println(garfield);
    System.out.println(tom);
    System.out.println(lisa);
    System.out.println(silvestre);
    
   
    

  }
    
}
