package mockito;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {


    @Test
    public void jugadorPierdeCuandoNumeroEsMenor() {

       //Dice dado = new Dice(6);
        Dice dado = Mockito.mock(Dice.class);

        // estamos simulando el dado en dos
        // siempre que se utilice ese metodo va a devolver dos
        Mockito.when(dado.roll()).thenReturn(2);


        Player jugador = new Player(dado, 3);
        assertFalse(jugador.play());
    }

    @Test
    public void jugadorPierdeCuandoNumeroEsMayor() {

        //Dice dado = new Dice(6);
        Dice dado = Mockito.mock(Dice.class);

        // estamos simulando el dado en dos
        // siempre que se utilice ese metodo va a devolver dos
        Mockito.when(dado.roll()).thenReturn(4);


        Player jugador = new Player(dado, 3);
        assertFalse(jugador.play());
    }

    @Test
    public void jugadorPierdeCuandoNumeroEsIgual() {

        //Dice dado = new Dice(6);
        Dice dado = Mockito.mock(Dice.class);

        // estamos simulando el dado en dos
        // siempre que se utilice ese metodo va a devolver dos
        Mockito.when(dado.roll()).thenReturn(4);


        Player jugador = new Player(dado, 4);
        assertTrue(jugador.play());
    }



}