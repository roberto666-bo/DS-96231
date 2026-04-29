package model;


import jakarta.persistence.*;

@Entity
@Table(name = "tab_usuario")
public class UsuarioModel {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false,unique = true)
    private String email;

    public UsuarioModel(){

    }

    public UsuarioModel(long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
