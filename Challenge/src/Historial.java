
import java.util.ArrayList;
import java.util.List;

public class Historial {
    private List<Conversion> historial = new ArrayList<>();


    public void agregarConversion(Conversion conversion) {
        historial.add(conversion);
    }
    public void mostrarHistorial(){
        if ((historial.isEmpty())){
            System.out.println("No hay registros que mostrar");
        }else {
            for (Conversion lista : historial){
                System.out.println(lista);
            }
        }

    }
}

