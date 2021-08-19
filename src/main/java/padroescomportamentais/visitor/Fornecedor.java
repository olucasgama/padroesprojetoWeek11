package padroescomportamentais.visitor;

public class Fornecedor implements Pessoa {

    private int codigo;
    private String nome;
    private String empresa;

    public Fornecedor(int codigo, String nome, String empresa) {
        this.codigo = codigo;
        this.nome = nome;
        this.empresa = empresa;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String aceitar(IVisitor IVisitor) {
        return IVisitor.exibirFornecedor(this);
    }
}
