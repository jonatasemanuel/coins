package cofrinho;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	// Criando a variavel que instanciaremos a entrada de teclado
        Scanner teclado = new Scanner(System.in);
        int opcao;


        Cofrinho cofrinho = new Cofrinho();

        System.out.println("-------------------------------------------");
        System.out.println("Escolha uma operação em seu Cofrinho Bank: ");
        System.out.println("-------------------------------------------");
        
        // Aqui optei por utilizar de text block, por sugestão da IDE IntellJ
        System.out.println("""
                1 - Mostrar total
                2 - Listar moedas
                3 - Adicionar moeda
                4 - Remover moeda
                0 - Sair"""
        );
        opcao = teclado.nextInt();

        int tipoMoeda, valor;
        Moeda moeda;
        while (opcao != 0) {
            switch (opcao) {
                case 1 -> cofrinho.totalConvertido();
                case 2 -> cofrinho.listagemMoedas();
                case 3 -> {
                    tipoMoeda = 0;
                    while (tipoMoeda > 3 || tipoMoeda <= 0) {
                        System.out.println("""
                                1 - Dolar
                                2 - Euro
                                3 - Real""");
                        tipoMoeda = teclado.nextInt();
                    }
                    System.out.println("Valor: ");
                    valor = teclado.nextInt();
                    moeda = null;
                    if (tipoMoeda == 1) {
                        moeda = new Dolar(valor);
                    } else if (tipoMoeda == 2) {
                        moeda = new Euro(valor);
                    } else {
                        moeda = new Real(valor);
                    }
                    cofrinho.adicionar(moeda);
                }
                case 4 -> {
                    tipoMoeda = 0;
                    while (tipoMoeda > 3 || tipoMoeda <= 0) {
                        System.out.println("""
                                Qual moeda deseja remover:
                                1 - Dolar
                                2 - Euro
                                3 - Real""");
                        tipoMoeda = teclado.nextInt();
                    }
                    System.out.println("Valor: ");
                    valor = teclado.nextInt();
                    moeda = null;
                    if (tipoMoeda == 1) {
                        moeda = new Dolar(valor);
                    } else if (tipoMoeda == 2) {
                        moeda = new Euro(valor);
                    } else {
                        moeda = new Real(valor);
                    }
                    cofrinho.remover(moeda);
                }
                default -> System.out.println("Opção inválida");
            }
            System.out.println("-------------------------------------------");
            System.out.println("Escolha uma operação em seu Cofrinho Bank: ");
            System.out.println("-------------------------------------------");
            System.out.println("""
                1 - Mostrar total
                2 - Listar moedas
                3 - Adicionar moeda
                4 - Remover moeda
                0 - Sair"""
            );
            opcao = teclado.nextInt();
        }
    }
}