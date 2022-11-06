package produtos;

public class Suco extends Produto{

    String sabor;

    public Suco(String sabor) {
        super();
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
}
