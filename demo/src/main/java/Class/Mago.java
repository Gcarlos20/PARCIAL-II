package Class;

/** Mago: ataca con hechizos y se protege con un escudo mágico. */
public class Mago extends Criatura {

    private String hechizos;

    public Mago(String nombre, int salud, int fuerza, String hechizos) {
        super(nombre, salud, fuerza);
        this.hechizos = hechizos;
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = getFuerza();
        System.out.println(getNombre() + " lanza " + hechizos + " con " + daño + " de daño a " + objetivo.getNombre());
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        int reducido = Math.max(1, daño - 5); // el escudo mágico absorbe 5
        System.out.println(getNombre() + " activa su escudo mágico y recibe " + reducido);
        recibirDaño(reducido);
    }
}