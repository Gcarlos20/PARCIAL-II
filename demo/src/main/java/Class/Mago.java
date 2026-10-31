package Class;

public class Mago extends Criatura {

    private String hechizos;

    public Mago(String nombre, int salud, int fuerza, String hechizos) {
        super(nombre, salud, fuerza);
        this.hechizos = hechizos;
    }

    /** El mago ataca con hechizos: daño = fuerza. */
    @Override
    public void atacar(Criatura objetivo) {
        int daño = getFuerza();
        System.out.println(getNombre() + " lanza " + hechizos + " con " + daño
                + " de daño a " + objetivo.getNombre());
        objetivo.defender(daño);
    }

    /** El escudo mágico absorbe 5 puntos de daño (mínimo recibe 1). */
    @Override
    public void defender(int daño) {
        int reducido = Math.max(1, daño - 5);
        System.out.println(getNombre() + " activa su escudo mágico y recibe " + reducido);
        recibirDaño(reducido);
    }
}