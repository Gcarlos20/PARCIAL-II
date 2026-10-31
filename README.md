# Parcial II - Batalla de Criaturas

**Integrante:** Gian Carlos

## Parte más complicada: ataques, defensas y un poquito dde polimorfismo

La parte que más se me dificultó fue entender cómo se combinan la herencia y el polimorfismo para resolver los ataques. La clase abstracta `Criatura` define los métodos `atacar` y `defender`, pero deja que cada tipo de criatura implemente su propio comportamiento.

Cuando una criatura ataca, calcula el daño según su tipo y llama a `defender` en el objetivo. Java ejecuta la versión de `defender` correspondiente a la clase real de ese objetivo: por ejemplo, el dragón reduce el daño al 80 %, el elfo al 60 %, el guerrero al 70 % y el mago resta 5 puntos. `Math.max(1, )` asegura que el daño recibido sea como mínimo 1 tambien no sabia como trabajar bien con esa libreria .

Después, cada defensa llama a `recibirDaño`, que descuenta el daño de la salud sin permitir que baje de cero. Así cada criatura tiene una defensa distinta y la clase base centraliza la regla común para actualizar la salud.
LITOOOOOO

**Integrante** Juan david Gonzalez

## Parte complicada 
Puse el archivo de main de la estructura de la carpeta donde no iba entonces se corrigio tambien cree una rama pero fue inproductiva a la hora de realizar cambios ya que tenia un version anterior a 
a la estructura del proyecto creada 

## Diagrama de clases

```mermaid
classDiagram
    class Criatura {
        <<abstract>>
        -String nombre
        -int salud
        -int fuerza
        +Criatura(String nombre, int salud, int fuerza)
        +getNombre() String
        +getSalud() int
        +getFuerza() int
        #recibirDaño(int daño) void
        +atacar(Criatura objetivo)* void
        +defender(int daño)* void
        +estaViva() boolean
    }

    class Dragon {
        -String escamas
        +Dragon(String nombre, int salud, int fuerza, String escamas)
        +atacar(Criatura objetivo) void
        +defender(int daño) void
    }

    class Guerrero {
        -String arma
        +Guerrero(String nombre, int salud, int fuerza, String arma)
        +atacar(Criatura objetivo) void
        +defender(int daño) void
    }

    class Mago {
        -String hechizos
        +Mago(String nombre, int salud, int fuerza, String hechizos)
        +atacar(Criatura objetivo) void
        +defender(int daño) void
    }

    class Elfo {
        -String arco
        +Elfo(String nombre, int salud, int fuerza, String arco)
        +atacar(Criatura objetivo) void
        +defender(int daño) void
    }

    class App {
        +main(String[] args) void
    }

    Criatura <|-- Dragon
    Criatura <|-- Guerrero
    Criatura <|-- Mago
    Criatura <|-- Elfo
    App ..> Dragon : crea y ejecuta
    App ..> Guerrero : crea y ejecuta
    App ..> Mago : crea y ejecuta
    App ..> Elfo : crea y ejecuta
```
