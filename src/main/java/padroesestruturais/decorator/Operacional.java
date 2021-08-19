package padroesestruturais.decorator;

public class Operacional extends Decorator{

    public Operacional(IFuncionario iFuncionario) {
        super(iFuncionario);
    }

    public String getNomePermissoes() {
        return "Operacional";
    }
}
