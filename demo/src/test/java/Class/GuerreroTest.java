package Class;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class GuerreroTest {

    @Test
    public void atacarReduceLaSaludDelObjetivo() {
        Guerrero atacante = new Guerrero("Aragorn", 90, 15, "Espada");
        Guerrero objetivo = new Guerrero("Boromir", 100, 10, "Escudo");

        atacante.atacar(objetivo);

        assertEquals(90, objetivo.getSalud());
    }

    @Test
    public void defenderNoPermiteQueLaSaludBajeDeCero() {
        Guerrero guerrero = new Guerrero("Aragorn", 90, 15, "Espada");

        guerrero.defender(200);

        assertEquals(0, guerrero.getSalud());
        assertFalse(guerrero.estaViva());
    }
}
