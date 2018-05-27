import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class S14Ejercicio03 {

  public static void main(String[] args) {
    ArrayList<Exception> excepciones = new ArrayList<Exception>();
    
    excepciones.add(new NumberFormatException());
    excepciones.add(new IOException());
    excepciones.add(new FileNotFoundException());
    excepciones.add(new IndexOutOfBoundsException());
    excepciones.add(new ArithmeticException());
    
    try {
      throw excepciones.get((int)(Math.random() * 6));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
}
