package br.calculadora.equacoes.principal;

import br.calculadora.equacoes.divisao.Divisao;
import br.calculadora.equacoes.multi.Multi;
import br.calculadora.equacoes.soma.Soma;
import br.calculadora.equacoes.subtracao.Subtracao;

import java.util.Scanner;

public class Calculadora {
    Soma soma = new Soma();
    Subtracao subtracao = new Subtracao();
    Multi multi = new Multi();
    Divisao divisao = new Divisao();

    Scanner leitura = new Scanner(System.in);
    int resposta = 0;
    public void calculadora() {


        while (resposta != 5) {
            System.out.println("\nEscolha qual operação deseja fazer:");
            System.out.println("""
                1 - Soma
                2 - Subtração
                3 - Multiplicação
                4 - Divisão
                5 - Encerrar
                
                Digite o numero:
                """);

            try {
                resposta = leitura.nextInt();

                switch (resposta) {
                    case 1 -> soma.soma();
                    case 2 -> subtracao.subtracao();
                    case 3 -> multi.multiplicacao();
                    case 4 -> divisao.divisao();
                    case 5 -> System.out.println("Saindo...");
                    default -> System.out.println("Opção inválida.");
                }

            } catch (Exception e) {
                System.out.println("Erro: entrada inválida. Digite apenas números.");
                leitura.next(); 
            }
        }

        leitura.close();
    }



}
