/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import model.Exercicio;
import model.Treino;
import model.Hibernate.TreinoHibernate;
import model.Professor;

/**
 *
 * @author BobaNote
 */
@ManagedBean(name = "treinoController")
@SessionScoped
public class TreinoController {

    private List<Treino> repositorioTreino = new ArrayList<>();
    private List<Exercicio> exercicios = null; 
    private Treino selectedTreino;

    private TreinoHibernate instance;

    public TreinoController() {
        instance = TreinoHibernate.getInstance(); 
        this.repositorioTreino = instance.recuperarTodos();
        this.selectedTreino = new Treino();
        this.exercicios = new ArrayList<>(); 
        
    }

    public String adicionar() {

//       Professor p = (Professor) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("professorLogado");
//
//        this.selectedTreino.setProfessor(p);
//        this.selectedTreino.setExercicios(this.exercicios);

        this.instance.adiciona(this.selectedTreino);
        this.selectedTreino = new Treino();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O Treino " + selectedTreino.getNome() + " foi cadastrado com sucesso"));
        
        return "apresentatreinosprofessor.xhtml";
    }


public String alterar() {
    
        instance.alterar(selectedTreino);
        this.selectedTreino = new Treino();
        
        return "apresentatreinosprofessor.xhtml";

     }
    
   public void deletar(Treino treino){
       instance.deletar(treino);
       this.selectedTreino = new Treino();
       FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O Treino foi excluído com sucesso"));
        
   } 
    public Treino recuperar (int codigo){
        return instance.recuperar(codigo);
    }
    
    public List<Treino> recuperarTodos(){
        return instance.recuperarTodos();
    }

        public List<Treino> recuperarPorCodigo(){
        return instance.recuperarTodos();
    }

        
    public List<Treino> getRepositorioTreino() {
        return repositorioTreino;
    }

    public void setRepositorioTreino(List<Treino> repositorioTreino) {
        this.repositorioTreino = repositorioTreino;
    }

    public Treino getSelectedTreino() {
        return selectedTreino;
    }

    public void setSelectedTreino(Treino selectedTreino) {
        this.selectedTreino = selectedTreino;
    }

    public TreinoHibernate getInstance() {
        return instance;
    }

    public void setInstance(TreinoHibernate instance) {
        this.instance = instance;
    }

    public List<Exercicio> getExercicios() {
        return exercicios;
    }

    public void setExercicios(List<Exercicio> rexercicios) {
        this.exercicios = exercicios;
    }
    
    public void listaExercicio(Exercicio ex) {
        this.exercicios.add(ex);
        
        this.selectedTreino.setExercicios(this.exercicios);
        
    }
    
}
