package parcial;

import Class.Dragon;
import Class.Elfo;
import Class.Guerrero;
import Class.Mago;

public class App {
    public static void main(String[] args) {
        Dragon dragon = new Dragon(
                "Smaug",
                100,
                20,
                "Escamas Rojas");

        Guerrero guerrero = new Guerrero(
                "Aragorn",
                90,
                15,
                "Espada");

        Mago mago = new Mago(
                "Gandalf",
                80,
                18,
                "Fuego");

        Elfo elfo = new Elfo(
                "Legolas",
                85,
                16,
                "Arco Largo");

        System.out.println("=== INICIO DE LA BATALLA ===");

        dragon.atacar(guerrero);

        mago.atacar(dragon);

        guerrero.atacar(elfo);

        elfo.atacar(mago);

        System.out.println("\n=== ESTADO FINAL ===");

        System.out.println(
                dragon.getNombre()
                        + " vivo: "
                        + dragon.estaViva());

        System.out.println(
                guerrero.getNombre()
                        + " vivo: "
                        + guerrero.estaViva());

        System.out.println(
                mago.getNombre()
                        + " vivo: "
                        + mago.estaViva());

        System.out.println(
                elfo.getNombre()
                        + " vivo: "
                        + elfo.estaViva());
    }
}
