package br.com.barbero.springbootrest.beans;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Carlos Barbero on 4/7/16.
 */
@Entity
@Table(name="pessoa")
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Basic
    private Long id;

    @Column
    private String nome;

    @Column
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
