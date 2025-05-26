import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Conversion {
    private String monedaOrigen;
    private String monedaDestino;
    private double montoOriginal;
    private double montoDestino;
    private LocalDateTime fechaYHora;

    public Conversion(String monedaOrigen, String monedaDestino, double montoOriginal, double montoDestino) {
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
        this.montoOriginal = montoOriginal;
        this.montoDestino = montoDestino;
        //se tiene que inicializar aqui la fecha y hora
        this.fechaYHora = LocalDateTime.now();
    }


    @Override
    public String toString() {
        DecimalFormat d = new DecimalFormat("#.00");
        DateTimeFormatter bonito = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return "("+fechaYHora.format(bonito)+")" +"\n"+ monedaOrigen + "=>>" + monedaDestino+ "\n" + d.format(montoOriginal) + "=>>" + d.format(montoDestino) ;
    }
}
