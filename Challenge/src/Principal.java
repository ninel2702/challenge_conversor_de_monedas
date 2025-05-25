import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int opcion = 0;
        double cambio = 0;
        ConvertidorApi convertidorApi = new ConvertidorApi();
        Moneda moneda = convertidorApi.buscaCambio(0);
        Conversor conversor = new Conversor();

        System.out.println("///////////////////////////////");
        System.out.println("Sean Bienvenid@s al Convertidor de Moneda");

        String menu = """
                1) Dolar =>> Peso Mexicano
                2) Peso Mexicano =>> Dolar
                3) Dolar =>> Euro
                4) Euro =>> Dolar
                5) Dolar =>> Yenes
                6) Yenes =>> Dolar
                7) Salir
                """;

        while (opcion !=7){
            System.out.println(menu);
            System.out.println("////////////////////////////////////");
            System.out.println("Escribe la opción para convertir la moneda");
            opcion = dato.nextInt();


            switch (opcion){
                case 1: //Dolar =>> Peso Mexicano
                    System.out.println("Ingresa el valor para convertir");
                    cambio = dato.nextDouble();
                    double pesoMexicano = moneda.conversion_rates().get("MXN");
                    double resultado = conversor.convertir(cambio, pesoMexicano);
                    System.out.println("Son "+resultado+ " Pesos mexicanos de " +cambio+ " Dolares");
                    System.out.println("////////////////////////////////////");
                    break;
                case 2: //Peso Mexicano =>> Dolar
                    System.out.println("Ingresa el valor para convertir");
                    cambio = dato.nextDouble();
                    double PesoMexicano = moneda.conversion_rates().get("MXN");
                    double resultado1 = conversor.convertir(cambio,1/ PesoMexicano);
                    System.out.println("Son "+resultado1+ " Dolares de " +cambio+ " Pesos mexicanos");
                    System.out.println("////////////////////////////////////");
                    break;
                case 3://Dolar =>> Euro
                    System.out.println("Ingresa el valor para convertir");
                    cambio = dato.nextDouble();
                    double euro = moneda.conversion_rates().get("EUR");
                    double resultado3 = conversor.convertir(cambio,euro);
                    System.out.println("Son "+ resultado3 + " Euros de " +cambio+ " Dolares");
                    break;
                case 4: //Euro =>> Dolar
                    System.out.println("Ingresa el valor para convertir");
                    cambio = dato.nextDouble();
                    double euros = moneda.conversion_rates().get("EUR");
                    double resultado4 = conversor.convertir(cambio,1/ euros);
                    System.out.println("Son "+resultado4+ " Dolares de " +cambio+ " Euros");
                    System.out.println("////////////////////////////////////");
                    break;
                case 5: //Dolar =>> Yenes
                    System.out.println("Ingresa el valor para convertir");
                    cambio = dato.nextDouble();
                    double yen = moneda.conversion_rates().get("JPY");
                    double resultado5 = conversor.convertir(cambio,yen);
                    System.out.println("Son "+ resultado5 + " Yenes de " +cambio+ " Dolares");
                    System.out.println("////////////////////////////////////");
                    break;
                case 6: //Yenes =>> Dolar
                    System.out.println("Ingresa el valor para convertir");
                    cambio = dato.nextDouble();
                    double yenes = moneda.conversion_rates().get("JPY");
                    double resultado6 = conversor.convertir(cambio,1/ yenes);
                    System.out.println("Son "+ resultado6 + " Yenes de " +cambio+ " Dolares");
                    System.out.println("////////////////////////////////////");
                    break;
                case 7:
                    System.out.println("Gracias por usar el convertidor de moneda");
                    break;
                default:
                    System.out.println("Opcion no valida");

            }
        }
    }
}