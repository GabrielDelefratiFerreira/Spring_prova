package com.example.ElielProva.Models;

import com.example.ElielProva.Enums.EstudanteEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_aluno")
public class EstudanteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private int idade;
    private EstudanteEnum aprovacao;

    public EstudanteModel(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public EstudanteEnum getAprovacao() {
        return aprovacao;
    }

    public void setAprovacao(EstudanteEnum aprovvacao) {
        this.aprovacao = aprovvacao;
    }
}