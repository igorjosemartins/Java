package vendas;

import produtos.Produto;

public class Venda extends Produto {

    Double qtd, valor;

    public void calculoParcial(Double qtd, Double valor) {
        Double calculoParcial = qtd * valor;
    }

    public void calculoTotal() {


    }
}
