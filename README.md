# Estructurasuwu
para la partida dndbarriles
#  DnD: La Comunidad del Barril en Busca de la Caguama Suprema 

Un juego de rol táctico por turnos para consola . Inspirado una partida que tuve en *Dungeons & Dragons 5e*, y guiado por tiradas de dados virtuales.

##  Sinopsis
Mision: robar alcohol del corrupto corrupto gobierno.

##Características Principales
* **Exploración Táctica (Grid 5x5):** Navegación por celdas bidimensionales manejando colisiones y límites de mapa.
* **Sistema de Combate D&D 5e:** Mecánicas de Iniciativa, Clase de Armadura (CA), Bonificadores de Ataque y Golpes Críticos (Nat d20).
* **Narrativa Interactiva:** Eventos dinámicos que cambian según el personaje seleccionado y tiradas de dados ocultas (ej. fuego amigo, decapitaciones épicas o gatos voladores).
* **Polimorfismo en Acción:** Sistema de clases donde cada personaje ejecuta su propio turno de combate de forma dinámica.

---
(resumido por IA de aqui en adelante, mucho texto)
## 🛡️ Clases Jugables

El jugador puede seleccionar entre 4 miembros de la party, todos heredando de la clase abstracta `Heroe`:

1. **Noel Dandelion (Paladín Goliath):** Un tanque colosal. Maneja un *Mandoble Cornirrojo*, conjura *Escudo de Fe* y usa su *Aguante de Piedra* para reducir el daño entrante.
2. **Knull Boca de Dragón (Enano Artificiero):** Maestro del combate a distancia. Usa un *Martillo de guerra*, *Cañón largo* y una *Bala Especial* mágica.
3. **Demet In Vraan (Druida):** Letal a distancia y en sigilo. Ataca con *Arco Largo*, *Daga* y puede sanar a la party con *Palabra Curativa*.
4. **La Gata con Botas:** Ágil y letal. Se especializa en sigilo y ataques rápidos con *Daga* aprovechando su alta Destreza.

**Enemigos:**
* **Guardia:** NPC hostil basado en la ficha oficial de D&D 5e (11 HP, CA 16, Lanza 1d6+1).

---

## 🏗️ Arquitectura del Proyecto (POO)

Este proyecto está construido aplicando los pilares de la Programación Orientada a Objetos en Java:
* **Abstracción y Herencia:** La clase abstracta `Heroe` define el estado base (`hpActual`, `claseArmadura`, etc.) y los métodos compartidos (`recibirDano`, `mover`).
* **Polimorfismo:** Implementación del método abstracto `@Override ejecutarTurnoCombate()` en las subclases, permitiendo que la clase `Partida` procese turnos sin importar qué héroe esté jugando.
* **Encapsulamiento y Separación de Responsabilidades:** 
  * `DnDbarriles.java`: Menú principal e instanciación.
  * `Partida.java`: Motor narrativo, gestor del mapa 5x5 y bucle de juego.
  * `Clases de Entidad`: Contienen la lógica matemática de daño y probabilidad aislada por personaje.

---

## 🚀 Requisitos y Ejecución

### Prerrequisitos
* Java Development Kit (JDK) 8 o superior.
* Un IDE compatible con Java (NetBeans, IntelliJ IDEA, Eclipse) o terminal de comandos.

### Cómo jugar
1. Clona este repositorio:
   ```bash
   git clone [https://github.com/tu-usuario/dnd-barriles.git](https://github.com/tu-usuario/dnd-barriles.git)
