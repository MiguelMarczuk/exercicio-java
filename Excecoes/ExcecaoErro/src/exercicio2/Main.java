package exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner leitor = new Scanner(System.in);

            System.out.println("digite sua senha");
            String senha = leitor.nextLine();

            validarSenha(senha);
            System.out.println("senha valida");
        } catch (ErroSenha e) {
            System.out.println(e.getMessage());
            System.out.println("error");


        }



    }

     static void  validarSenha(String senha){
        if (senha.length() < 8) {

            throw new ErroSenha("senha deve ter no minimo 8 caracteres");
        }
    }

 }


