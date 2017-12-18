package controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
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

    


//
//    public String realizarLoginAluno(String login, String senha) {
//        
//        alunoLogado =null;
//        List<Aluno> aluno = new AlunoController().recuperarTodos();
//        for (Aluno a : aluno) {
//            if (a.getCpf().equals(login)) {
//                if (a.getSenha().equals(senha)) {
//                    this.alunoLogado = a;
//                }
//                break;
//            }
//        }
// 
//     if (alunoLogado == null) {
//            return "indexlogar.xhtml";
//        } else {
//            return "menualunologado.xhtml";
//        }
//    




public String realizarLoginAluno(String login,String senha){
    
    alunoLogado=null;
    List<Aluno> alunos = new AlunoController().recuperarTodos();
     
     for(Aluno m : alunos){
         if(m.getCpf().equals(login)){
             if(m.getSenha().equals(senha)){
                   this.alunoLogado = m;
                  FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("alunoLogado", m);
                 return "menualunologado.xhtml";
             }
         }
     }
     return "indexlogar.xhtml";
    }


        public void logoutAluno(){
        alunoLogado=null;
}


}
 

