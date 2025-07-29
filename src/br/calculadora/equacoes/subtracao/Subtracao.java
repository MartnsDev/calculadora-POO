package br.calculadora.equacoes.subtracao;

import java.util.Scanner;

public class Subtracao {

    public void subtracao() {
        Scanner leitura = new Scanner(System.in);
        double primeiroNumero = 0;
        double segundoNumero = 0;
        boolean entradaValida = false;

   
        while (!entradaValida) {
            try {
                System.out.print("Primeiro número: ");
                primeiroNumero = Double.parseDouble(leitura.nextLine().replace(",", "."));
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número válido (ex: 5, 3.4, -2).");
            }
        }

        entradaValida = false;

     
        while (!entradaValida) {
            try {
                System.out.print("Segundo número: ");
                segundoNumero = Double.parseDouble(leitura.nextLine().replace(",", "."));
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número válido (ex: 5, 3.4, -2).");
            }
        }

        double resultado = Math.abs(primeiroNumero - segundoNumero);
        System.out.println("Resultado da subtração (diferença absoluta): " + resultado);
    }
}
