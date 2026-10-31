package Class;

public abstract class Criatura {

    private String nombre;
    private int salud;
    private int fuerza;

    public Criatura(String nombre, int salud, int fuerza) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
    }

    public String getNombre() { return nombre; }
    public int getSalud()     { return salud; }
    public int getFuerza()    { return fuerza; }

    // Resta salud sin dejar que baje de 0. Lo usan las subclases al defenderse.
    protected void recibirDaño(int daño) {
        salud = Math.max(0, salud - daño);
    }

    // Ataca a otra criatura. Cada tipo ataca de forma distinta. 
    public abstract void atacar(Criatura objetivo);

    // Recibe un ataque. Cada tipo se defiende de forma distinta. 
    public abstract void defender(int daño);

    //Indica si la criatura sigue viva (salud > 0).
    public boolean estaViva() {
        return salud > 0;
    }
}