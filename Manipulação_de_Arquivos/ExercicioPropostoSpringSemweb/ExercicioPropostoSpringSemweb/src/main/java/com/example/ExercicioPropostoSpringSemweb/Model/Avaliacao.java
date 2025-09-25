package com.example.ExercicioPropostoSpringSemweb.Model;

import java.util.List;

public class Avaliacao <T>{
    public T avaliacao;
    public double nota;
    public String comentario;



    public Avaliacao(T avaliacao, double nota, String comentario) {
        this.avaliacao = avaliacao;
        this.nota = nota;
        this.comentario = comentario;
    }

    public double getNota() {
        return nota;
    }

    public static <T> double calcularMediaNotas(List<Avaliacao<T>> avaliacoes) {
        if (avaliacoes.isEmpty()) {
            throw new IllegalArgumentException("A lista de avaliações está vazia.");
        }
        double soma = 0;
        for (Avaliacao<T> avaliacao : avaliacoes) {
            soma += avaliacao.getNota();
        }
        return soma / avaliacoes.size();
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "avaliacao=" + avaliacao +
                ", nota=" + nota +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}
