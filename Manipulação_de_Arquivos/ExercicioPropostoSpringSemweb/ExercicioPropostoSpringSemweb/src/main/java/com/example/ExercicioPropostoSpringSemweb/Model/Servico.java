package com.example.ExercicioPropostoSpringSemweb.Model;

public class Servico {
    public String nome;
    public int quantidade;


    public Servico(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }
}
