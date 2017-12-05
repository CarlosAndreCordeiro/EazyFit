package controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Hibernate.ProfessorHibernate;
import model.Professor;

/**
 *
 * @author BobaNote
 */
@ManagedBean(name = "professorController")
@SessionScoped
public class ProfessorController {
    
     
    private List<Professor> repositorioProfessor = null;
    
    private Professor selectedProfessor;

    public ProfessorController(){
        ProfessorHibernate ph = new ProfessorHibernate();
        this.repositorioProfessor= ph.recuperarTodos();
       this.selectedProfessor = new Professor();
    }
    private static ProfessorHibernate instance = null; 
    public static ProfessorHibernate getInstance(){
        if(instance == null){
            instance = new ProfessorHibernate();
        }
    return instance;
    }
    public void adicionar(){
        instance.adiciona(selectedProfessor);
    }
   public void deletar(Professor professor){
       instance.deletar(professor);
   } 
    public Professor recuperar (int codigo){
        return instance.recuperar(codigo);
    }
    public Professor recuperarCpf(String cpf){
        return instance.recuperaCpf(cpf);
    }
    public List<Professor> recuperarTodos(){
        return instance.recuperarTodos();
    }

    public List<Professor> getRepositorioProfessor() {
        return repositorioProfessor;
    }

    public void setRepositorioProfessor(List<Professor> repositorioProfessor) {
        this.repositorioProfessor = repositorioProfessor;
    }

    public Professor getSelectedProfessor() {
        return selectedProfessor;
    }

    public void setSelectedProfessor(Professor selectedProfessor) {
        this.selectedProfessor = selectedProfessor;
    }

}
