package br.calculadora.equacoes.soma;

import java.util.Scanner;

public class Soma {

    public void soma() {
        Scanner leitura = new Scanner(System.in);
        double primeiroNumero = 0;
        double segundoNumero = 0;
        boolean entradaValida = false;

        // Loop para garantir leitura correta do primeiro número
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

        // Loop para garantir leitura correta do segundo número
        while (!entradaValida) {
            try {
                System.out.print("Segundo número: ");
                segundoNumero = Double.parseDouble(leitura.nextLine().replace(",", "."));
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número válido (ex: 5, 3.4, -2).");
            }
        }

        double resultado = primeiroNumero + segundoNumero;
        System.out.println("Resultado da soma: " + resultado);
    }
}
