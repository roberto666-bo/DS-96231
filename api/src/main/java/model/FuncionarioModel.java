package model;


import jakarta.persistence.*;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

@Entity
@Table(name = "tab_funcionario")
public class FuncionarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String email;

    public FuncionarioModel() {
    }

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false)
    private String telefone;

    public FuncionarioModel(String email) {
        this.email = email;
    }

    public FuncionarioModel(Long id, String email, String senha, String telefone) {,

        .
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }

    public FuncionarioModel(Long id) {
        this.id = id;
    }
}
