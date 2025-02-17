package Arrays;

public class Array2D {
    public static void main(String[] args) {

        String[][] ninjasEAldeias = new String[3][4];
        //primeiro slot fala da linha, e o segundo fala da coluna
        ninjasEAldeias[0][0] = "Konoha";
        ninjasEAldeias[0][1] = "Naruto";
        ninjasEAldeias[0][2] = "Sasuke";
        ninjasEAldeias[0][3] = "Sakura";

        ninjasEAldeias[1][0] = "Nevoa";
        ninjasEAldeias[1][1] = "Zabuza";
        ninjasEAldeias[1][2] = "Haku";
        ninjasEAldeias[1][3] = "Mano peixe";

        ninjasEAldeias[2][0] = "Deserto";
        ninjasEAldeias[2][1] = "Gaara";
        ninjasEAldeias[2][2] = "Temari";
        ninjasEAldeias[2][3] = "Kankuro";


        for (int i = 0; i < ninjasEAldeias.length; i++) {
            for (int j = 0; j < ninjasEAldeias[i].length; j++) {
                System.out.println(ninjasEAldeias[i][j]);
            }
            System.out.println();
        }
    }
}
