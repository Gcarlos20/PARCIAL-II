# Parcial II - Batalla de Criaturas

**Integrante:** Gian Carlos

## Parte más complicada: ataques, defensas y un poquito dde polimorfismo

La parte que más se me dificultó fue entender cómo se combinan la herencia y el polimorfismo para resolver los ataques. La clase abstracta `Criatura` define los métodos `atacar` y `defender`, pero deja que cada tipo de criatura implemente su propio comportamiento.

Cuando una criatura ataca, calcula el daño según su tipo y llama a `defender` en el objetivo. Java ejecuta la versión de `defender` correspondiente a la clase real de ese objetivo: por ejemplo, el dragón reduce el daño al 80 %, el elfo al 60 %, el guerrero al 70 % y el mago resta 5 puntos. `Math.max(1, )` asegura que el daño recibido sea como mínimo 1 tambien no sabia como trabajar bien con esa libreria .

Después, cada defensa llama a `recibirDaño`, que descuenta el daño de la salud sin permitir que baje de cero. Así cada criatura tiene una defensa distinta y la clase base centraliza la regla común para actualizar la salud.
LITOOOOOO

**Integrante** Juan david Gonzalez

## Parte complicada 
Al momento de desarrollar el parcial tuve algunos inconvenientes con la estructura del proyecto. Inicialmente ubiqué el archivo principal en una carpeta incorrecta y después fue necesario moverlo para que quedara dentro de la estructura Maven. También tuve problemas con una rama de GitHub que estaba desactualizada respecto a la rama principal, por lo que tuve que crear una nueva rama para poder seguir trabajando sin conflictos.

## Uso de Inteligencia Artificial
Utilicé inteligencia artificial como apoyo para aclarar dudas sobre algunos conceptos vistos en clase y para orientarme en la creación de la simulación principal del proyecto. También me ayudó a comprender mejor el uso de ramas, commits y pull requests en GitHub. La información obtenida fue revisada antes de aplicarla al PARCIAL II.

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
