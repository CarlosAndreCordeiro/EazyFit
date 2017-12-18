package controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Aluno;
import model.Aluno;


@SessionScoped
@ManagedBean(name = "loginAlunoController")
public class LoginAlunoController {

    private Aluno alunoLogado = null;

    public LoginAlunoController() {
        alunoLogado = new Aluno();
    }

    public Aluno getAlunoLogado() {
        return alunoLogado;
    }

    public void setAlunoLogado(Aluno alunoLogado) {
        this.alunoLogado = alunoLogado;
    }

    public String realizarLoginAluno(String login, String senha) {

        List<Aluno> aluno = new AlunoController().recuperarTodos();
        for (Aluno a : aluno) {
            if (a.getCpf().equals(login)) {
                if (a.getSenha().equals(senha)) {
                    this.alunoLogado = a;
                }
                break;
            }
        }
        if (alunoLogado == null) {
            return null;
        } else {
            return "menualunologado.xhtml";
        }
    }
    
    
    
    
    
}
