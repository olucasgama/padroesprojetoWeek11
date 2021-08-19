package padroesestruturais.decorator;

public abstract class Decorator implements IFuncionario {

    private IFuncionario funcionario;
    public String permissoes;

    public Decorator(IFuncionario iFuncionario) {
        this.funcionario = iFuncionario;
    }

    public IFuncionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(IFuncionario iFuncionario) {
        this.funcionario = iFuncionario;
    }

    public String getPermissoes() {
        return this.funcionario.getPermissoes() + "/" + this.getNomePermissoes();
    }

    public abstract String getNomePermissoes();

    public void setPermissoes(String permissoes) {
        this.permissoes = permissoes;
    }
}
