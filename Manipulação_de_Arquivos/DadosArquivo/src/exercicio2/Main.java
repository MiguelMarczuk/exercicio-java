package exercicio2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {

        Titulo titulo = new Titulo();
        titulo.nome = "rafael";
        titulo.anoDeLancamento =2025;

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(titulo));

//exercic 3 junto o settPrettyprinting
    }

}
