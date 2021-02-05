/**
 * 4. Sentencia Condicional
 *
 * 4. Vamos a ampliar uno de los ejercicios de la relación anterior para
 *    considerar las extras. Escribe un programa que calcule el salario
 *    semanal de un trabajador teniendo en cuenta que las horas
 *    ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la
 *    hora. A partir de la hora 41, se pagan a 16 euros la hora.
 *
 * @author Luis José Sánchez
 */
public class S04Ejercicio04 {
  public static void main(String[] args) {

    int sueldoSemanal;

    System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    
    if (horasTrabajadas <= 40) {
      sueldoSemanal = 12 * horasTrabajadas;
    } else {
      sueldoSemanal = (40 * 12) + ((horasTrabajadas - 40) * 16);
    }
    System.out.println("El sueldo semanal que le corresponde es de " + sueldoSemanal + " euros");
  }
}
