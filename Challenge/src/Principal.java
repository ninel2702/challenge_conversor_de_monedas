import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int opcion = 0;
        double cambio = 0;
        ConvertidorApi convertidorApi = new ConvertidorApi();
        Moneda moneda = convertidorApi.buscaCambio(0);
        Conversor conversor = new Conversor();
        DecimalFormat decimal = new DecimalFormat("#.00");
        //Historial
        Historial historial = new Historial();

        System.out.println("///////////////////////////////");
        System.out.println("Sean Bienvenid@s al Convertidor de Moneda");

        String menu = """
                1) Dólar =>> Peso Mexicano
                2) Peso Mexicano =>> Dólar
                3) Dólar =>> Euro
                4) Euro =>> Dólar
                5) Dólar =>> Yenes
                6) Yenes =>> Dólar
                7) dólar =>> Dólar canadiense
                8) Dólar canadiense =>> Dólar
                9) Dólar =>> Corona
                10) Corona =>> Dólar
                15) Historial de conversiones
                11) Salir
                """;

        while (opcion !=11){
            System.out.println(menu);
            System.out.println("////////////////////////////////////");
            System.out.println("Escribe la opción que deseas");
            opcion = dato.nextInt();


            switch (opcion){
                case 1: //Dolar =>> Peso Mexicano
                    System.out.println("Ingresa el valor para convertir");
                    cambio = dato.nextDouble();
                    double pesoMexicano = moneda.conversion_rates().get("MXN");
                    double resultado = conversor.convertir(cambio, pesoMexicano);
                    System.out.println("Son "+ decimal.format(resultado)+ " Pesos mexicanos de " +cambio+ " Dolares");
                    Conversion una = new Conversion("USD","MXN", cambio, resultado);
                    historial.agregarConversion(una);
                    System.out.println("////////////////////////////////////");
                    break;
                case 2: //Peso Mexicano =>> Dolar
                    System.out.println("Ingresa el valor para convertir");
                    cambio = dato.nextDouble();
                    double PesoMexicano = moneda.conversion_rates().get("MXN");
                    double resultado1 = conversor.convertir(cambio,1/ PesoMexicano);
                    System.out.println("Son "+decimal.format(resultado1)+ " Dolares de " +cambio+ " Pesos mexicanos");
                    Conversion dos = new Conversion("MXN","USD", cambio, resultado1);
                    historial.agregarConversion(dos);
                    System.out.println("////////////////////////////////////");
                    break;
                case 3://Dolar =>> Euro
                    System.out.println("Ingresa el valor para convertir");
                    cambio = dato.nextDouble();
                    double euro = moneda.conversion_rates().get("EUR");
                    double resultado3 = conversor.convertir(cambio,euro);
                    System.out.println("Son "+decimal.format(resultado3) + " Euros de " +cambio+ " Dolares");
                    Conversion tres = new Conversion("USD","EUR", cambio, resultado3);
                    historial.agregarConversion(tres);
                    System.out.println("////////////////////////////////////");
                    break;
                case 4: //Euro =>> Dolar
                    System.out.println("Ingresa el valor para convertir");
                    cambio = dato.nextDouble();
                    double euros = moneda.conversion_rates().get("EUR");
                    double resultado4 = conversor.convertir(cambio,1/ euros);
                    System.out.println("Son "+decimal.format(resultado4)+ " Dolares de " +cambio+ " Euros");
                    Conversion cuatro = new Conversion("EUR","USD", cambio, resultado4);
                    historial.agregarConversion(cuatro);
                    System.out.println("////////////////////////////////////");
                    break;
                case 5: //Dolar =>> Yenes
                    System.out.println("Ingresa el valor para convertir");
                    cambio = dato.nextDouble();
                    double yen = moneda.conversion_rates().get("JPY");
                    double resultado5 = conversor.convertir(cambio,yen);
                    System.out.println("Son "+decimal.format(resultado5) + " Yenes de " +cambio+ " Dolares");
                    Conversion cinco = new Conversion("USD","JPY", cambio, resultado5);
                    historial.agregarConversion(cinco);
                    System.out.println("////////////////////////////////////");
                    break;
                case 6: //Yenes =>> Dolar
                    System.out.println("Ingresa el valor para convertir");
                    cambio = dato.nextDouble();
                    double yenes = moneda.conversion_rates().get("JPY");
                    double resultado6 = conversor.convertir(cambio,1/ yenes);
                    System.out.println("Son "+decimal.format(resultado6) + " Yenes de " +cambio+ " Dolares");
                    Conversion seis = new Conversion("JPY","USD", cambio, resultado6);
                    historial.agregarConversion(seis);
                    System.out.println("////////////////////////////////////");
                    break;
                    //SOPORTE PARA MAS MONEDAS
                case 7: //dolar =>> dolar canadiense
                    System.out.println("Ingresa el valor para convertir");
                    cambio = dato.nextDouble();
                    double canada = moneda.conversion_rates().get("CAD");
                    double resultado7 = conversor.convertir(cambio, canada);
                    System.out.println("Son "+decimal.format(resultado7) + " Dolares canadienses de " +cambio+ " Dolares");
                    Conversion siete = new Conversion("USD","CAD", cambio, resultado7);
                    historial.agregarConversion(siete);
                    System.out.println("////////////////////////////////////");
                    break;
                case 8: //dolar canadiense =>> Dolar
                    System.out.println("Ingresa el valor para convertir");
                    cambio = dato.nextDouble();
                    double dolarescan = moneda.conversion_rates().get("CAD");
                    double resultado8 = conversor.convertir(cambio,1/ dolarescan);
                    System.out.println("Son "+decimal.format(resultado8) + " Dolares de " +cambio+ " Dolares canadienses");
                    Conversion ocho = new Conversion("CAD","USD", cambio, resultado8);
                    historial.agregarConversion(ocho);
                    System.out.println("////////////////////////////////////");
                    break;
                case 9: //Dolar =>> Corona
                    System.out.println("Ingresa el valor para convertir");
                    cambio = dato.nextDouble();
                    double corona = moneda.conversion_rates().get("NOK");
                    double resultado9 = conversor.convertir(cambio, corona);
                    System.out.println("Son "+decimal.format(resultado9) + " Coronas de " +cambio+ " Dolares");
                    Conversion nueve = new Conversion("USD","NOK", cambio, resultado9);
                    historial.agregarConversion(nueve);
                    System.out.println("////////////////////////////////////");
                    break;
                case 10: // corona =>> Dolar
                    System.out.println("Ingresa el valor para convertir");
                    cambio = dato.nextDouble();
                    double coronas = moneda.conversion_rates().get("NOK");
                    double resultado10 = conversor.convertir(cambio,1/ coronas);
                    System.out.println("Son "+decimal.format(resultado10) + " Dolares de " +cambio+ " Coronas");
                    Conversion diez = new Conversion("NOK","USD", cambio, resultado10);
                    historial.agregarConversion(diez);
                    System.out.println("////////////////////////////////////");
                    break;
                case 15:
                    System.out.println("////////////////////////////////////");
                    System.out.println("Historial de conversiones");
                    historial.mostrarHistorial();
                    System.out.println("////////////////////////////////////");
                    break;
                case 11:
                    System.out.println("Gracias por usar el convertidor de moneda");
                    break;
                default:
                    System.out.println("Opcion no valida");

            }
        }
    }
}
