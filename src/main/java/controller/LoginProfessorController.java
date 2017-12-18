package controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import model.Professor;
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

public String realizarLoginProfessor(String login,String senha){
    
    professorLogado=null;
    List<Professor> professors = new ProfessorController().recuperarTodos();
     
     for(Professor m : professors){
         if(m.getCpf().equals(login)){
             if(m.getSenha().equals(senha)){
                   this.professorLogado = m;
                  FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("professorLogado", m);
                 return "menuprofessorlogado.xhtml";
             }
         }
     }
     return "indexlogar.xhtml";
    }




        public void logoutProfessor(){
        professorLogado=null;
}




}
 
