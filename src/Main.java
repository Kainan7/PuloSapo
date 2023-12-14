import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int alturaPuloSapo = s.nextInt();
        int qntCano = s.nextInt();
        ArrayList<Integer> canos = new ArrayList<>();

        for (int i = 0; i < qntCano; i++){
            canos.add(s.nextInt());
        }

        Sapo sapo = new Sapo(alturaPuloSapo);
        Jogo jogo = new Jogo(sapo, canos);

        String resultado = jogo.jogar();
        System.out.println(resultado);





    }
}