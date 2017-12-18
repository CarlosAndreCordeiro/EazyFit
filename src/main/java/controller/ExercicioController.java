/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import model.Exercicio;
import model.Hibernate.ExercicioHibernate;

/**
 *
 * @author BobaNote
 */

@ManagedBean(name = "exercicioController")
@SessionScoped
public class ExercicioController {
    
        private List<Exercicio> repositorioExercicio = null;
    
    private Exercicio selectedExercicio;
    
    private ExercicioHibernate instance;

    public ExercicioController(){
        instance = new ExercicioHibernate();
        this.repositorioExercicio= instance.recuperarTodos();
       this.selectedExercicio = new Exercicio();
    }
   
    public void adicionar(){

        
            instance.adiciona(selectedExercicio);
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O Exercicio "+ selectedExercicio.getNome() +" foi cadastrado com sucesso"));
           this.selectedExercicio= new Exercicio();
           
    }
    
     public String alterar() {
         instance.alterar(selectedExercicio);
           this.selectedExercicio= new Exercicio();
        
         return "apresentaexerciciosprofessor.xhtml";

     }
    
   public void deletar(Exercicio exercicio){
       instance.deletar(exercicio);
           this.selectedExercicio= new Exercicio();
    
       FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O Exercicio foi excluído com sucesso"));
        
   } 
    public Exercicio recuperar (int codigo){
        return instance.recuperar(codigo);
    }
    
    public List<Exercicio> recuperarTodos(){
        return instance.recuperarTodos();
    }

    public List<Exercicio> getRepositorioExercicio() {
        return repositorioExercicio;
    }

    public void setRepositorioExercicio(List<Exercicio> repositorioExercicio) {
        this.repositorioExercicio = repositorioExercicio;
    }

    public Exercicio getSelectedExercicio() {
        return selectedExercicio;
    }

    public void setSelectedExercicio(Exercicio selectedExercicio) {
        this.selectedExercicio = selectedExercicio;
    }

    public ExercicioHibernate getInstance() {
        return instance;
    }

    public void setInstance(ExercicioHibernate instance) {
        this.instance = instance;
    }


    
    
    
}
