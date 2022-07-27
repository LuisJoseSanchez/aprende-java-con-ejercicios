/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo1;

/**
 *
 * @author Julian
 */
public class Doctor {
    String name;
    int documento;
    String especialidad;
    
    //Metodos
    public void showName(){
            System.out.println(name);
            System.out.println(documento);
            System.out.println(especialidad);
    }
    


    public Doctor() {
      this.name = "Nombre por defecto";
      this.documento = 0;
      this.especialidad = "Especialidad por defecto";
      
    }

    public Doctor(String name, int documento, String speciality) {
      this.name = name;
      this.documento = documento;
      this.especialidad = speciality;
    }

}
