package mockito;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {


    @Test
    public void jugadorPierdeCuandoNumeroEsDemasiadoPequeno() {
        Dice dado = new Dice(6);
        Player jugador = new Player(dado, 2);
        assertEquals(false, jugador.play());
    }

}