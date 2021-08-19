package padroescomportamentais.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VisitorTest {

    @Test
    void exibeFuncionario(){
        Funcionario funcionario = new Funcionario(12, "Fernando", 1700.0f);
        Visitor visitor = new Visitor();

        assertEquals("Funcionario{codigo=12, nome='Fernando', salario=1700.0}", visitor.exibir(funcionario));
    }

    @Test
    void exibeFornecedor(){
        Fornecedor fornecedor = new Fornecedor(1, "André", "Lupo");
        Visitor visitor = new Visitor();

        assertEquals("Fornecedor{codigo=1, nome='André', empresa=Lupo}", visitor.exibir(fornecedor));
    }

}