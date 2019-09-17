package controller;

import java.util.List;
import static javafx.beans.binding.Bindings.select;
import static javafx.beans.binding.Bindings.select;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import model.Hibernate.AlunoHibernate;
import model.Aluno;

/**
 *
 * @author BobaNote
 */
@ManagedBean(name = "alunoController")
//@ViewScoped
@SessionScoped
public class AlunoController {
    
     
    private List<Aluno> repositorioAluno = null;
    
    private Aluno alunoLogado;
    //configurando aluno logado pra ser o mesmo aluno selecionado
    private Aluno selectedAluno;
    private AlunoHibernate instance;

    public AlunoController(){
        instance = AlunoHibernate.getInstance();
        this.repositorioAluno= instance.recuperarTodos();
       this.selectedAluno = new Aluno();
    }
    
    
    
   
    public String adicionar(){
    
            instance.adiciona(selectedAluno);
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage
        ("O Aluno "+selectedAluno.getNome()+" foi cadastrado com sucesso"));
        
            this.selectedAluno = new Aluno();
            return "indexlogar.xhtml";
    }
    
     public String alterar() {
         
                  
         instance.alterar(selectedAluno);
         this.selectedAluno = new Aluno();
        
         
         return "menualunologado.xhtml";

     }
    
   public void deletar(Aluno aluno){
       instance.deletar(aluno);
           this.selectedAluno = new Aluno();

       FacesContext.getCurrentInstance().addMessage(null, new FacesMessage
        ("O Aluno foi excluído com sucesso"));
        
   } 
    public Aluno recuperar (int codigo){
        return instance.recuperar(codigo);
    }
    public Aluno recuperarCpf(String cpf){
        return instance.recuperarCpf(cpf);
    }
    public List<Aluno> recuperarTodos(){
        return instance.recuperarTodos();
    }

    public List<Aluno> getRepositorioAluno() {
        return repositorioAluno;
    }

    public void setRepositorioAluno(List<Aluno> repositorioAluno) {
        this.repositorioAluno = repositorioAluno;
    }

    public Aluno getSelectedAluno() {
        return selectedAluno;
    }

    public void setSelectedAluno(Aluno selectedAluno) {
        this.selectedAluno = selectedAluno;
    }

    public AlunoHibernate getInstance() {
        return instance;
    }

    public void setInstance(AlunoHibernate instance) {
        this.instance = instance;
    }

}














