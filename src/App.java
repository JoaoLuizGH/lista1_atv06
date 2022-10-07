import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         //Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

        
      Scanner teclado = new Scanner(System.in);

      double raio, area;

      System.out.println("Informe o valor do raio do circulo: ");
      raio = teclado.nextDouble();

      area =  3.14 * (raio * raio);

      teclado.close();

      System.out.println(" A área de um circulo com raio de: "+ raio + " metros, é igual a: " + area + "m²");  
    }
}
