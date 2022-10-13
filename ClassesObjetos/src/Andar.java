
public class Andar {

    static boolean andando;

    void PessoaAndando(){
        andando = true;

        System.out.println("A pessoa está " + andando);

        if(!andando) {
            System.out.println("A pessoa está parada.");
        }
    }

    public static void main(String[] args) {


    }
}

