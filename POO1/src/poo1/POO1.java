/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo1;

import com.sun.javafx.css.CalculatedValue;

/**
 *
 * @author Julian
 */
public class POO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Ernesto perez";
        myDoctor.documento = 82567899;
        myDoctor.especialidad = "cirujano";
        myDoctor.showName();
        
        Doctor myDoctor1 = new Doctor("Julian Loaiza", 5421389, "ortopedista");
        System.out.println(myDoctor1.name);
        System.out.println(myDoctor1.documento);
        System.out.println(myDoctor1.especialidad);
        
        Calculadora myCalculadora = new Calculadora();
        myCalculadora.suma(3,5);
        
        Paciente myPaciente = new Paciente("Pepito", 236689, "Calle 100 # 16#23");
        System.out.println(myPaciente.name);
        System.out.println(myPaciente.getName());
        System.out.println(myPaciente.dirección);
        
        
    }
    
}
