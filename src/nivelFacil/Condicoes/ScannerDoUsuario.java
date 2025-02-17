package Condicoes;
import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        Scanner caixaDeTexto = new Scanner(System.in);
        System.out.println("Escreva o nome do ninja:");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O ninja é: "+nomeDoNinja);
        System.out.println("Agora informe a idade do ninja:");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println(nomeDoNinja + " tem " + idadeDoNinja + " anos.");
        if (idadeDoNinja >= 18){
            System.out.println("Esse ninja já é maior de idade e pode ir para missões fora da aldeia!");
        }else {
            System.out.println("Esse ninja é muito novo para missões fora da vila!");
        }
        caixaDeTexto.close();
    }
}
