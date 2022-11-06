package produtos;

public class Pastel extends Produto {

    String recheio;

    public Pastel(String recheio) {
        super();
        this.recheio = recheio;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }


}
