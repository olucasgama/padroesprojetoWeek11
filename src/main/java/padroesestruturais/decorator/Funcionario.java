package padroesestruturais.decorator;

public class Funcionario implements IFuncionario {

    public String permissao;

    public Funcionario() {
    }

    public String getPermissoes() {
        return "Funcionário";
    }
}
