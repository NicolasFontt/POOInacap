
package Clases;

public class Seguros {

    public static int calcularValorSeguro(Autos autos,int valorUF ){   
        int valorSeguro =0;
        valorSeguro = (int) ((2019-autos.getAño()) * (valorUF*0.1));
        return valorSeguro;

        }
    public static Boolean esAsegurable(Autos autos){
        return (2019-autos.getAño())<=10;

    }
}

