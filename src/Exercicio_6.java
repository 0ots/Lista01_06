import java.util.Scanner;

import java.lang.Math;

public class Exercicio_6 {

    public static void main(String[] args) throws Exception {

        Scanner input;

        input = new Scanner(System.in);

        double raio, conversaoarea;

        System.out.println("Digite o raio do círculo: ");
        
        raio = input.nextDouble();

        input.close();

        conversaoarea = Math.pow(raio, 2);

        System.out.print("O valor da área é: " + conversaoarea);

    }
    
}
