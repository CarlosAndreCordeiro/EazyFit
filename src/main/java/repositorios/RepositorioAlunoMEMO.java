/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import java.util.ArrayList;
import model.Aluno;

public class RepositorioAlunoMEMO implements RepositorioGenerico <Aluno> {
    
    private ArrayList <Aluno> alunos = null;
    
    public RepositorioAlunoMEMO(){
    this.alunos = new ArrayList<>();
    }
    
    

    @Override
    public void adiciona(Aluno aluno) {
        this.alunos.add(aluno);
    
    }

    @Override
    public Aluno recuperar(int codigo) {
    for(int i = 0; i < alunos.size(); i++){
        if(codigo== alunos.get(i).getCodigo()){
            return alunos.get(i);
        }
    }
    return null;
    }
    

    @Override
    public void alterar(Aluno aluno) {
    for(int i = 0; i < alunos.size(); i++){
        if(aluno.getCodigo() == alunos.get(i).getCodigo()){
            alunos.set(i, aluno);
        }
    }
    }

    @Override
    public void deletar(Aluno aluno) {
    this.alunos.remove(aluno);
    }

    @Override
    public ArrayList recuperarTodos() {
    return alunos;
    }
 
}
