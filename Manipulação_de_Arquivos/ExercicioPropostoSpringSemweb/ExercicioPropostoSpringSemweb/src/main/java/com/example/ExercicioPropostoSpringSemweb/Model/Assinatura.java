package com.example.ExercicioPropostoSpringSemweb.Model;

public class Assinatura {
    public String nome;
    public String data;


    public Assinatura(String nome, String data) {
        this.nome = nome;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Assinatura{" +
                "nome='" + nome + '\'' +
                ", data=" + data +
                '}';
    }
}
