
package model;

import repositorios.AlunoHibernate;

public class teste {
    
    public static void main(String args[]){
    
    
    AlunoHibernate ah = new AlunoHibernate();


    Aluno a = new Aluno(2,"c","u","r","l","os");
    
    
    
    ah.adiciona(a);
    //ah.deletar(a);
   
    
    
    }
}
