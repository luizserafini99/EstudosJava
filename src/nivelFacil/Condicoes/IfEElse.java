package Condicoes;

public class IfEElse {
    public static void main(String[] args) {
        String nome = "Naruto";
        String rank = "";
        int idade = 10;
        boolean hokage = false;
        short numeroDeMissoes = 1;
        if (numeroDeMissoes >= 20){
            System.out.println("Rank: Jounnin");
        } else if (numeroDeMissoes >= 10) {
            System.out.println("Rank: Chunnin");
        } else {
            System.out.println("Rank: Gennin");
        }
    }
}
