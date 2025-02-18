package nivelIntermediario;


public class Main {
    public static void main(String[] args) {
        //OBJETO 1
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da folha";
        Naruto.idade = 18;
        Naruto.modoSabioAtivado();

        //OBJETO 2
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.idade = 18;
        Sasuke.SharinganAtivado();

        //OBJETO 3
        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 18;
        int quantoTempoFalta = Sakura.AnosParaSeTornarHokage(70);
        System.out.println(quantoTempoFalta);

   }
}


