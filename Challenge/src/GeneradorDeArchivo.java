import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GeneradorDeArchivo {
    public void guardarJson (Moneda moneda) throws IOException{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter guardado = new FileWriter("Moneda.txt");
        guardado.write(gson.toJson(moneda));
        guardado.close();    }
}
