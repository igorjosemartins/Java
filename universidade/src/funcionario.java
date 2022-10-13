
public class funcionario extends pessoa{

    String departamento;

    public void cadastraDepartamento(){
        System.out.println("Departamento cadastrado");
    }
    @Override
    public String cadastrarPessoa(){
        return "Cadastra funcionário.";
    }

    // super = pega sempre os métodos/atributos da classe pai
    public void cadastraPessoaGeral(){
        super.cadastrarPessoa();
    }
}