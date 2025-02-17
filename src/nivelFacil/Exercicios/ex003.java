package Exercicios;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {


        // entrada de dados
        Scanner scanner = new Scanner(System.in);


        //contadores
        int numeroMax = 10;
        String[] ninjas = new String[numeroMax];
        int ninjasCadastrados = 0;
        int opcoes = 0;

        while (opcoes != 3) {


            //menu
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcoes = scanner.nextInt();
            scanner.nextLine();

            switch (opcoes){
                case 1:
                    if(ninjasCadastrados < numeroMax){
                        System.out.println("Digite o nome do ninja");
                        String nomeNinja = scanner.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados++;
                        System.out.println("Ninja Cadastrado com sucesso");
                    }else {
                        System.out.println("A lista está cheia!");
                    }
                    break;

                case 2:
                    if(ninjasCadastrados == 0){
                        System.out.println("Nenhum ninja encotrado!");
                    }else{
                        System.out.println("========= LISTA DE NINJAS ============");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Encerrando o programa...AGUARDE");
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;
            }

        }
    }

}