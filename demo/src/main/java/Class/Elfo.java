package Class;

public class Elfo extends Criatura {

    private String arco;

    public Elfo(String nombre, int salud, int fuerza, String arco) {
        super(nombre, salud, fuerza);
        this.arco = arco;
    }

    /** El elfo dispara flechas: daño = fuerza + 3 por su puntería. */
    @Override
    public void atacar(Criatura objetivo) {
        int daño = getFuerza() + 3;
        System.out.println(getNombre() + " dispara con " + arco + " causando " + daño
                + " de daño a " + objetivo.getNombre());
        objetivo.defender(daño);
    }

    /** Su agilidad le permite esquivar: recibe solo el 60% del daño (mínimo 1). */
    @Override
    public void defender(int daño) {
        int reducido = Math.max(1, daño * 60 / 100);
        System.out.println(getNombre() + " esquiva con agilidad y recibe " + reducido);
        recibirDaño(reducido);
    }
}