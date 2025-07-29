package br.calculadora.equacoes.divisao;

import java.util.Scanner;

public class Divisao {

    public void divisao() {
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
                System.out.print("Segundo número (divisor): ");
                segundoNumero = Double.parseDouble(leitura.nextLine().replace(",", "."));
                if (segundoNumero == 0) {
                    System.out.println("Erro: Divisão por zero não é permitida. Digite outro número.");
                } else {
                    entradaValida = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número válido (ex: 5, 3.4, -2).");
            }
        }

        double resultado = primeiroNumero / segundoNumero;
        System.out.println("Resultado da divisão: " + resultado);
    }
}
