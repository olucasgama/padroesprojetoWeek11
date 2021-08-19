package padroesestruturais.decorator;

public class Gerencial extends Decorator {

    public Gerencial(IFuncionario iFuncionario) {
        super(iFuncionario);
    }

    public String getNomePermissoes() {
        return "Gerencial";
    }
}
