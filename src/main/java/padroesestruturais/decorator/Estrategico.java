package padroesestruturais.decorator;

public class Estrategico extends Decorator {

    public Estrategico(IFuncionario iFuncionario) {
        super(iFuncionario);
    }

    public String getNomePermissoes() {
        return "Estratégico";
    }

}
