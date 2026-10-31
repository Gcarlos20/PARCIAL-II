package Class;

/** Guerrero: ataca con su arma y bloquea parte del golpe con el escudo. */
public class Guerrero extends Criatura {

    private String arma;

    public Guerrero(String nombre, int salud, int fuerza, String arma) {
        super(nombre, salud, fuerza);
        this.arma = arma;
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = getFuerza();
        System.out.println(getNombre() + " golpea con " + arma + " causando " + daño + " a " + objetivo.getNombre());
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        int reducido = Math.max(1, daño * 70 / 100); // el escudo bloquea 30%
        System.out.println(getNombre() + " bloquea con su escudo y recibe " + reducido);
        recibirDaño(reducido);
    }
}