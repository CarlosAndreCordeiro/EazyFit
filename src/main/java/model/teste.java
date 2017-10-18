
package model;

import repositorios.AlunoHibernate;

public class teste {
    
    public static void main(String args[]){
    
    
    AlunoHibernate ah = new AlunoHibernate();


    Aluno a = new Aluno(1,"a","b","c","d","e");
    
    ah.adiciona(a);
   
    
    
    }
}
