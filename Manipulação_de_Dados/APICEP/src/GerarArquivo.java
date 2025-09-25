import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GerarArquivo {
    private  Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void geradorDeArquivo(Endereco endereco) throws IOException {
        FileWriter escrita = new FileWriter("arquivo.txt" , true);
        String json = gson.toJson(endereco);
        escrita.write(json + "\n");
        escrita.close();
    }
}
