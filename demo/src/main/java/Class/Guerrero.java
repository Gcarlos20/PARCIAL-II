package Class;

/** Guerrero: ataca con su arma y bloquea parte del golpe con el escudo. */
public class Guerrero extends Criatura {

    private String arma;
// esta parte del código es la clase Guerrero que hereda de la clase Criatura. La clase Guerrero tiene un atributo privado llamado arma, que representa el arma que utiliza el guerrero para atacar.
    public Guerrero(String nombre, int salud, int fuerza, String arma) {
        super(nombre, salud, fuerza);
        this.arma = arma;
    }
// esto sirve para inicializar un objeto de la clase Guerrero con un nombre, salud, fuerza y arma. El constructor llama al constructor de la clase padre (Criatura) para inicializar los atributos heredados y luego asigna el valor del arma al atributo privado.
    @Override
    public void atacar(Criatura objetivo) {
        int daño = getFuerza();
        System.out.println(getNombre() + " golpea con " + arma + " causando " + daño + " a " + objetivo.getNombre());
        objetivo.defender(daño);
    }
// ue sirve para que el guerrero ataque a otra criatura (objetivo). Calcula el daño basado en la fuerza del guerrero, imprime un mensaje indicando el ataque y luego llama al método defender del objetivo para que reciba el daño
    @Override
    public void defender(int daño) {
        int reducido = Math.max(1, daño * 70 / 100); // el escudo bloquea 30%
        System.out.println(getNombre() + " bloquea con su escudo y recibe " + reducido);
        recibirDaño(reducido);
    }
}