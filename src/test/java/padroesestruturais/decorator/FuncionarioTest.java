package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void retornaPermissaoFuncionario(){
        IFuncionario iFuncionario = new Funcionario();

        assertEquals("Funcionário", iFuncionario.getPermissoes());
    }

    @Test
    void retornaPermissaoEstrategico(){
        IFuncionario iFuncionario = new Estrategico(new Funcionario());

        assertEquals("Funcionário/Estratégico", iFuncionario.getPermissoes());
    }

    @Test
    void retornaPermissaoGerencial(){
        IFuncionario iFuncionario = new Gerencial(new Funcionario());

        assertEquals("Funcionário/Gerencial", iFuncionario.getPermissoes());
    }

    @Test
    void retornaPermissaoOperacional(){
        IFuncionario iFuncionario = new Operacional(new Funcionario());

        assertEquals("Funcionário/Operacional", iFuncionario.getPermissoes());
    }

    @Test
    void retornaPermissaoCustomizadaUm(){
        IFuncionario iFuncionario = new Gerencial (new Operacional(new Funcionario()));

        assertEquals("Funcionário/Operacional/Gerencial", iFuncionario.getPermissoes());
    }

    @Test
    void retornaPermissaoCustomizadaDois(){
        IFuncionario iFuncionario = new Estrategico (new Gerencial(new Funcionario()));

        assertEquals("Funcionário/Gerencial/Estratégico", iFuncionario.getPermissoes());
    }

    @Test
    void retornaPermissaoCustomizadaTres(){
        IFuncionario iFuncionario = new Estrategico (new Operacional(new Funcionario()));

        assertEquals("Funcionário/Operacional/Estratégico", iFuncionario.getPermissoes());
    }

}