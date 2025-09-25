package exercicio4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {

        Veiculo veiculo1 = new Veiculo();

        veiculo1.modelo = "honda";
        veiculo1.ano = 2025;
        veiculo1.cor = "preto";

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        System.out.println(gson.toJson(veiculo1));
    }
}
