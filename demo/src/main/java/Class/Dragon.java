package Class;

public class Dragon extends Criatura {

    private String escamas;
// este es el constructor de la clase Dragon que recibe el nombre, salud, fuerza y escamas del dragón. Llama al constructor de la clase padre (Criatura) para inicializar los atributos heredados y luego asigna el valor de las escamas al atributo privado.
    public Dragon(String nombre, int salud, int fuerza, String escamas) {
        super(nombre, salud, fuerza);
        this.escamas = escamas;
    }
// esta parte del código es la clase Dragon que hereda de la clase Criatura. La clase Dragon tiene un atributo privado llamado escamas, que representa las escamas que protegen al dragón. La clase Dragon implementa los métodos atacar y defender de manera específica para un dragón.
    @Override
    public void atacar(Criatura objetivo) {
        int daño = getFuerza() * 2;
        System.out.println(getNombre() + " lanza fuego con " + daño + " de daño a " + objetivo.getNombre());
        objetivo.defender(daño);
    }
// esta parte del código es la clase Dragon que hereda de la clase Criatura. La clase Dragon tiene un atributo privado llamado escamas, que representa las escamas que protegen al dragón. La clase Dragon implementa los métodos atacar y defender de manera específica para un dragón.
    @Override
    public void defender(int daño) {
        int reducido = Math.max(1, daño * 80 / 100); // las escamas absorben 20%
        System.out.println(getNombre() + " resiste con sus escamas " + escamas + " y recibe " + reducido);
        recibirDaño(reducido);
    }
}