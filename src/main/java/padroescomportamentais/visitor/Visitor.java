package padroescomportamentais.visitor;

public class Visitor implements IVisitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return "Funcionario{" +
                "codigo=" + funcionario.getCodigo() +
                ", nome='" + funcionario.getNome() + '\'' +
                ", salario=" + funcionario.getSalario() +
                '}';
    }

    @Override
    public String exibirFornecedor(Fornecedor fornecedor) {
        return "Fornecedor{" +
                "codigo=" + fornecedor.getCodigo() +
                ", nome='" + fornecedor.getNome() + '\'' +
                ", empresa=" + fornecedor.getEmpresa() +
                '}';
    }
}
