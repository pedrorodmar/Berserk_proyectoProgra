package map;

import enemies.EnemigoBasico;
import enemies.JefeFinal;

public class Senda3 extends Zona {

    public Senda3() {
        super("El Altar de la Invocación");
    }

    @Override
    protected void inicializarEnemigos() {
        getEnemigos().add(new EnemigoBasico("Poseso", "Cuerpo humano controlado por espíritus malignos.", 160, 32, 16));
        getEnemigos().add(new EnemigoBasico("Apóstol Menor", "Un ser grotesco que ha sacrificado su humanidad.", 190, 38, 20));
        getEnemigos().add(new JefeFinal("Gran Inquisidor Mozgus", "El rostro de la fe ciega y el castigo divino.", 380, 50, 30));
    }

    @Override
    public String getIntroduccion() {
        return "El suelo bajo tus pies se siente blando, casi como carne. Estás cerca del epicentro " +
               "de un antiguo ritual; el hedor a azufre y desesperación es casi insoportable.";
    }

    @Override
    public String getDialogoIntermedio() {
        return "Una criatura de múltiples ojos te observa desde un pilar en ruinas. " +
               "'Tu marca... brilla con una intensidad deliciosa. El festín está por comenzar'.";
    }

    @Override
    public String getDialogoFinal() {
        return "Una figura imponente con rostro de piedra bloquea el camino: '¡En el nombre de la pureza absoluta, " +
               "tus pecados serán purgados con el fuego sagrado de la agonía!'";
    }
}