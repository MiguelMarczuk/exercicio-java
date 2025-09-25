package com.example.ExercicioPropostoSpringSemweb;

import com.example.ExercicioPropostoSpringSemweb.Model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.example.ExercicioPropostoSpringSemweb.Model.Avaliacao.calcularMediaNotas;

@SpringBootApplication
public class ExercicioPropostoSpringSemwebApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ExercicioPropostoSpringSemwebApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

        Tarefa tarefa = new Tarefa("madeira" , true , "Marcos");

        ObjectMapper mapper = new ObjectMapper();
        File arquivo = new File("tarefa.json");

        mapper.writeValue(arquivo , tarefa);

      Tarefa tarefaconvertida = mapper.readValue(arquivo , Tarefa.class);

        System.out.println(tarefaconvertida);


        Produto p = new Produto("caixa", 50);
        Produto p2 = new Produto("tenis", 50);

        Avaliacao <Produto> avaliaProduto = new Avaliacao<>(p, 6.2, "qualidade boa");
        Avaliacao <Produto> avaliaProdutos = new Avaliacao<>(p2, 1.2, "qualidade ruim");

        System.out.println(avaliaProduto);
        System.out.println(avaliaProdutos);


        Servico service = new Servico("guardaCosta", 5);
        Avaliacao <Servico> avaliaServico = new Avaliacao<>(service, 10, "otimos seguranças");
        System.out.println(avaliaServico);

        Assinatura assinatura = new Assinatura("marcos" , "27/12/2020");

        Avaliacao<Assinatura> avaliaAssinatura = new Avaliacao<>(assinatura, 4 , "pessima assinatura");

        System.out.println(avaliaAssinatura);

        List<Avaliacao<Produto>> avaliacoesProduto = new ArrayList<>();
        avaliacoesProduto.add(avaliaProduto);
        avaliacoesProduto.add(avaliaProdutos);

        double media = calcularMediaNotas(avaliacoesProduto);
        System.out.println(media);
}}
