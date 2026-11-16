# ☢️ Fallout: Aventura en el yermo (Proyecto DAM - 1ª Evaluación)☢️ 

## Miembros del equipo
* Abel
* Sebastián
* Alejandro Rózpide

----
## Como arrancar el juego

Para iniciar el juego debes irte al archivo Principal dentro de la carpeta de 05-proyecto en src.
En cuanto llegues a ese archivo lo inicias desde tu editor de código

----
## Características
- **Razas:** Humano (100 HP) o Mutante (85 HP), cada una con su equipo inicial.
- **Combate por turnos:** atacar (cada arma tiene su daño y munición), defender con la Servo Armadura (necesita Fusion Core), huir y curarse. Hay enemigos comunes y jefes.
- **Inventario:** 25 huecos, con armas, munición, objetos de curación y objetos clave.
- **Exploración aleatoria:** casas, cajas fuertes y un casino.
- **Minijuegos:** Ahorcado (hackeos y cajas fuertes), Blackjack y Ruleta (se apuesta con Estimulantes).
- **Sistema de karma:** tus decisiones lo suben o bajan y, junto con la facción elegida, determinan el final.
- **Facciones:** Hermandad del Acero o Legión de César.
----
## Finales
- **Bueno:** desarmar el Silo Omega.
- **Neutro:** abandonar el conflicto o robar los códigos.
- **Malo:** lanzar las ojivas bajo el mando de la Legión.
- Cada uno tiene variantes, incluidas las de muerte.
----
## Estructura
| Clase | Función |
|---|---|
| `Principal` | Punto de entrada |
| `Historia` | Hilo narrativo principal |
| `Eleccion` | Decisiones del jugador y karma |
| `Seleccion` | Elige el final según facción y karma |
| `FinalBueno`, `FinalNeutro`, `FinalMalo` | Finales |
| `Combate`, `ItemCurar` | Sistema de combate y curación |
| `Inventario`, `ItemsYcajas`, `Saqueo` | Objetos y botín |
| `Habitaciones`, `Apostar`, `Blackjack`, `Ruleta`, `Ahorcado` | Exploración y minijuegos |
| `VidaYPersonaje` | Vida, karma y estado del personaje |
| `TextoMod` | Colores y efecto de escritura |
-----
## Descripción del proyecto
----
- Nuestro juego consiste en una aventura narrativa con interacciones donde el jugador toma decisiones que pueden afectar el transcurso de una historia con miniuegos, "inventario" y más.
----
## Requisitos
- Java 17 o superior
- Terminal con soporte de colores ANSI y caracteres Unicode
----

## Progreso actual
* Inicio historia humano (completado)
* Inicio historia mutante (completado)
* Juego de ahorcado (completdo)
* Sistema inventario (completado)
* Sistema saqueo (completado)
* Elección de raza (completado)
* Sistema de vida (completado)
* Si eliges una opción no declarada te permite volver a elegir
* Sistema Combate (Completado)
* Sistema de curación (Completado)
* Facciones (Completado)
* Habitaciones (Completado)
* Historia (Completado)
----
## Enlace repositorio
* GitHub: https://github.com/DEOJOEMAMA/Proyecto-evaluable-programacion
