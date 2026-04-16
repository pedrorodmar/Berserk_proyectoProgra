package map;

import enemies.EnemigoBasico;
import enemies.JefeFinal;

public class Senda2 extends Zona {

    public Senda2() {
        super("El Bosque de los Árboles Espíritu");
    }

    @Override
    protected void inicializarEnemigos() {
        getEnemigos().add(new EnemigoBasico("Troll", "Bestia hambrienta surgida del fango.", 130, 26, 12));
        getEnemigos().add(new EnemigoBasico("Sátiro Corrupto", "Espíritu de la naturaleza consumido por el mal.", 150, 30, 14));
        getEnemigos().add(new JefeFinal("Kelpie de las Sombras", "Un espíritu acuático ancestral y letal.", 260, 40, 20));
    }

    @Override
    public String getIntroduccion() {
        return "La niebla es tan espesa que parece sólida. Te has adentrado en un lugar donde " +
               "el mundo de los hombres y el reino de los espíritus se superponen violentamente.";
    }

    @Override
    public String getDialogoIntermedio() {
        return "Una risa estridente sacude las ramas. Una figura astada bloquea el sendero: " +
               "'Pobre alma perdida... tus miedos huelen tan dulces en este bosque'.";
    }

    @Override
    public String getDialogoFinal() {
        return "El cauce del río se alza, desafiando la gravedad, formando la silueta de una bestia líquida. " +
               "Un espíritu ancestral ha decidido que tu viaje termina en el fondo de estas aguas.";
    }
}