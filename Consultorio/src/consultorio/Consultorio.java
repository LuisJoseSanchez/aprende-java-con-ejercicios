/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consultorio;

/**
 *
 * @author Julian
 */
import static ui.UIMenu.*;
public class Consultorio {

    /**
     * @param args the command line arguments
     */



    public static void main(String[] args) {

        Doctor myDoctor = new Doctor();
        myDoctor.name = "Alejandro Rodríguez";
        myDoctor.showName();
        myDoctor.showId();



        Doctor myDoctorAnn = new Doctor();
        myDoctor.showId();

        showMenu();

    }




    
}
