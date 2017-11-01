
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author BobaNote
 */

@Entity
public class Atividade  {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int codigo;
    @Column
    private String nome;
    @Column
    private String descricao;
    @Column
    private String intensidade;
    @Column
    private String serie;
  
    
    public Atividade() {
    }

    
    
    
}
