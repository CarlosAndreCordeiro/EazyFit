/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Hibernate;

import java.time.Clock;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import model.Exercicio;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import model.DAO.ExercicioDao;

/**
 *
 * @author BobaNote
 */
public class ExercicioHibernate implements ExercicioDao {

    private EntityManager em;
    private SessionFactory sessions;
    private static ExercicioHibernate instance = null;

    public static ExercicioHibernate getInstance() {

        if (instance == null) {
            instance = new ExercicioHibernate();
        }
        return instance;
    }

     public ExercicioHibernate() {

        Configuration cfg = new Configuration().configure();
        this.sessions = cfg.buildSessionFactory();
    }
     
    @Override
    public void adiciona(Exercicio exercicio) {
    Session session = this.sessions.openSession();
    Transaction t = session.beginTransaction();
        try{
            session.persist(exercicio);
            t.commit();
        }catch (Exception e){
            System.out.println("deu merda ao Adicionar exercicio ");
            t.rollback();
        } finally{
            session.close();
        }
    }

    @Override
    public Exercicio recuperar(int codigo) {
    Session session = this.sessions.openSession();
        try {
            return (Exercicio) session.getSession().createQuery(
                    "From Exercicio Where codigo=" + codigo).getResultList().get(0);

        } finally {
            //Fechamos a sessão
            session.close();
        }    
    }

    @Override
    public void alterar(Exercicio exercicio) {
             Session session = this.sessions.openSession();
        Transaction t = session.beginTransaction();

        try {
            session.update(exercicio);
            t.commit();
        } catch (Exception e ) {
            System.out.println("deu merda ao alterar exercicio");
            t.rollback();

        } finally {
            session.close();
        }    
    }

    @Override
    public void deletar(Exercicio exercicio) {
         Session session = this.sessions.openSession();
        Transaction t = session.beginTransaction();

        try {
            session.delete(exercicio);
            t.commit();
        } catch (Exception e ) {
            System.out.println("Deu erro ao deletar exercicio");
            t.rollback();

        } finally {
            session.close();
        }
    }

    @Override
    public List recuperarTodos() {
     Session session = this.sessions.openSession();
        List<Exercicio> exercicios = new ArrayList();
        try{   
    exercicios = session.createQuery("FROM exercicios").list();
        }catch(Exception e){
            System.out.println("deu *##@#@ na recuperacao de todos os exercicios cadastrados");
        }finally{
            session.close();
        }
    return exercicios;
     }
}
