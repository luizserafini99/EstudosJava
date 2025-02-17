package nivelIntermediario;


public class Main {
    public static void main(String[] args) {
        // Criar o ninja Naruto
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da folha";
        Naruto.idade = 18;

        //Criar Sasuke
        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.idade = 27;

        //Aplicando Metodos ao meu objeto
        Sasuke.SharinganAtivado();
        Sasuke.EuSouUmNinja();
        String chamandoMetodo = Sasuke.EuSouUmNinja();
        System.out.println(chamandoMetodo);

        int quantoTempoFalta = Sasuke.AnosParaSeTornarHokage(70);
        System.out.println("Voce tem " + Sasuke.idade + " entao falta " + quantoTempoFalta + " para se tornar Hokage!");


        //Criar Sakura
        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 18;

    }
}
