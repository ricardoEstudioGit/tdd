package mockito;

public class Player {

    private Dice dado;
    private int numeroMinimoGanador;

    public Player(Dice dice, int numeroMinimoGanador) {
        this.dado = dice;
        this.numeroMinimoGanador = numeroMinimoGanador;
    }

    public boolean play(){
        int numeroDado = dado.roll();
        System.out.println(numeroDado);
        return numeroDado == numeroMinimoGanador;
    }

}
