
package com.mycompany.mavenproject1;

/**
 *
 * @author Lucca
 */
public class menuControle {

    private int n;
    private double[] vetor;

    public menuControle() {
        this.n = 0;
        this.vetor = new double[n];
    }

    public void lerVetor() {
        System.out.println("Informe o tamanho do vetor: ");
        this.n = Integer.parseInt(System.console().readLine());

        System.out.println("Informe os elementos do vetor: ");
        for (int i = 0; i < n; i++) {
            this.vetor[i] = Double.parseDouble(System.console().readLine());
        }
    }

    public double mediaAritmetica() {
        double soma = 0;

        for (int i = 0; i < n; i++) {
            soma += vetor[i];
        }

        return soma / n;
    }

    public double valorMeio() {
        int meio = n / 2;

        if (n % 2 == 0) {
            return vetor[meio];
        } else {
            return vetor[meio + 1];
        }
    }

    public static void main(String[] args) {
        menuControle vetores = new menuControle();

        int opcao;

        do {
            System.out.println("Menu de opções:");
            System.out.println("1 - Ler vetor");
            System.out.println("2 - Calcular média aritmética");
            System.out.println("3 - Obter o valor do elemento do meio");
            System.out.println("0 - Sair");

            System.out.println("Informe a opção desejada: ");
            opcao = Integer.parseInt(System.console().readLine());

            switch (opcao) {
                case 1:
                    vetores.lerVetor();
                    break;
                case 2:
                    System.out.println("A média aritmética é: " + vetores.mediaAritmetica());
                    break;
                case 3:
                    System.out.println("O valor do elemento do meio é: " + vetores.valorMeio());
                    break;
                case 0:
                    System.out.println("Fim do programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);
    }
}

