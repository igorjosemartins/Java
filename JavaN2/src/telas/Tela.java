package telas;

import vendas.Venda;

import static java.lang.System.exit;

public class Tela extends Venda {

    public void menuPrincipal() {

        titleMenuPrincipal();
    }

    public void menuPastel() {
        //return sabor + quantidade;
        titleMenuPasteis();

    }

    public void menuSuco() {

        titleMenuSucos();
    }

    public void encerrarPrograma() {
        cls();
        System.out.println("\n\nEncerrando programa.......");
        exit(0);
    }



    // ----- shortcuts -----
    public void titleMenuPrincipal() {

        System.out.println("\n-------------------------------");
        System.out.println("Lanchonete do Igor");
        System.out.println("-------------------------------\n");

        String opcProdutos = """
                Selecione uma opção:\s
                 1 - Pastel
                 2 - Suco
                 3 - Cancelar compra""";

        System.out.println(opcProdutos);
    }

    public void titleMenuPasteis() {
        cls();
        System.out.println("-------------------------------");
        System.out.println("Pasteis");
        System.out.println("-------------------------------\n");

        String opcPasteis = """
                Selecione um sabor:\s
                 1 - Carne     ------------ 8.00
                 2 - Frango    ------------ 7.50
                 3 - Calabresa ------------ 7.00
                 4 - Queijo    ------------ 6.50
                 5 - Voltar ao menu principal""";

        System.out.println(opcPasteis);
    }

    public void titleMenuSucos() {
        cls();
        System.out.println("-------------------------------");
        System.out.println("Sucos");
        System.out.println("-------------------------------\n");

        String opcSucos = """
                Selecione um sabor:\s
                 1 - Laranja ------------ 5.50
                 2 - Pêssego ------------ 5.00
                 3 - Uva     ------------ 4.50
                 4 - Voltar ao menu principal""";

        System.out.println(opcSucos);
    }

    public void cls() {
        System.out.println("\n\n\n\n\n");
    }
}
