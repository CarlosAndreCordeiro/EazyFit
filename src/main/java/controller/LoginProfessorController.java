package controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Aluno;
import model.Professor;


@SessionScoped
@ManagedBean(name = "loginProfessorController")
public class LoginProfessorController {

    private Professor professorLogado = null;

    public LoginProfessorController() {
        professorLogado = new Professor();
    }

    public Professor getProfessorLogado() {
        return professorLogado;
    }

    public void setProfessorLogado(Professor professorLogado) {
        this.professorLogado = professorLogado;
    }

    public String realizarLoginProfessor(String login, String senha) {

        List<Professor> professor = new ProfessorController().recuperarTodos();
        for (Professor p : professor) {
            if (p.getCpf().equals(login)) {
                if (p.getSenha().equals(senha)) {
                    this.professorLogado = p;
                }
                break;
            }
        }
        if (professorLogado == null) {
            return null;
        } else {
            return "menuprofessorlogado.xhtml";
        }
    }
    
    
    
    
    
}
