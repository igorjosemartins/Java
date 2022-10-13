
import java.util.Random;
// intro POO

// classe
public class Lampada {

    // atributo
    boolean state;

    // método

    void Switch() {
        if (state == true) {
            System.out.println("A lampada esta: ligada");
        } else {
            System.out.println("A lampada esta: desligada");
        }
    }
}