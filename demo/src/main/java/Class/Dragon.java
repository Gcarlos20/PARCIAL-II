package Class;

public class Dragon extends Criatura {

    private String escamas;

    public Dragon(String nombre, int salud, int fuerza, String escamas) {
        super(nombre, salud, fuerza);
        this.escamas = escamas;
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = getFuerza() * 2;
        System.out.println(getNombre() + " lanza fuego con " + daño + " de daño a " + objetivo.getNombre());
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        int reducido = Math.max(1, daño * 80 / 100); // las escamas absorben 20%
        System.out.println(getNombre() + " resiste con sus escamas " + escamas + " y recibe " + reducido);
        recibirDaño(reducido);
    }
}