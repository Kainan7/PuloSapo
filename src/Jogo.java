import java.util.ArrayList;

public class Jogo {

    private Sapo sapo;
    private ArrayList<Integer> alturaCanos;

    public Jogo(Sapo sapo, ArrayList<Integer> alturaCanos) {
        this.sapo = sapo;
        this.alturaCanos = alturaCanos;
    }

    public String jogar(){
        for (int i = 0; i < alturaCanos.size() - 1; i++){
            int diferenca = alturaCanos.get(i+1) - alturaCanos.get(i);

            if (Math.abs(diferenca) > sapo.getAlturaPuloSapo()){
                return "GAME OVER";
            }
        }
        return "YOU WIN";
    }



}