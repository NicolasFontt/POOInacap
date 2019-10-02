
package Main;

import Clases.Autos;
import Clases.Seguros;
import java.util.Scanner;


public class Main {

    private static int valorUF;
    
       
    public static void main(String[] args) {
        System.out.print("Ingrese valor del uf: ");
        Scanner scanner = new Scanner (System.in);
        valorUF = scanner.nextInt();

        Autos autos = new Autos();
        
        System.out.print("Ingrese marca del vehiculo: ");
        autos.setMarca(capturarMarca());
        
        System.out.print("Ingrese modelo del vehiculo: ");
        autos.setModelo(capturarModelo());
        
        System.out.print("Ingrese año del vehiculo: ");
        autos.setAño(capturarAño());
        
        Seguros seguros = new Seguros();
        if(seguros.esAsegurable(autos)){
        System.out.print("El valor del seguro es: ");
        System.out.println(seguros.calcularValorSeguro(autos, valorUF));
        }else{
            System.out.println("El auto no es asegurable");
        }
    }
    private static String capturarMarca() {
        Scanner scanner = new Scanner (System.in);
        String marca = scanner.nextLine();
        return marca;
        
    }

    private static String capturarModelo() {
        Scanner scanner  = new Scanner (System.in);
        String modelo = scanner.nextLine();
        return modelo;
    }

    private static int capturarAño() {
       Scanner scanner  = new Scanner (System.in);
       int año = scanner.nextInt();
       return año;
    }

}
    
