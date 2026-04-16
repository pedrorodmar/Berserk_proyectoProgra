package map;

import enemies.EnemigoBasico;
import enemies.JefeFinal;

public class Senda1 extends Zona {

    public Senda1() {
        super("El Asedio de Midland");
    }

    @Override
    protected void inicializarEnemigos() {
        // Paso 2: Configurar enemigos de dificultad progresiva
        getEnemigos().add(new EnemigoBasico("Soldado Kushan", "Un guerrero de vanguardia con armadura ligera.", 85, 18, 6));
        getEnemigos().add(new EnemigoBasico("Explorador Pishacha", "Humano alterado por magia kushan.", 110, 22, 10));
        getEnemigos().add(new JefeFinal("Horda de Bakiraka", "El clan de asesinos del Imperio.", 220, 35, 15));
    }

    @Override
    public String getIntroduccion() {
        return "El cielo se tiñe de ceniza sobre las llanuras de Midland. El aire huele a hierro y humo; " +
               "la invasión de los Kushan ha convertido este reino en un matadero de hombres.";
    }

    @Override
    public String getDialogoIntermedio() {
        return "De entre las tiendas de campaña en llamas surge una figura deforme. '¡Más carne para el General!', " +
               "sisea el Pishacha mientras su mandíbula se desencaja de forma antinatural.";
    }

    @Override
    public String getDialogoFinal() {
        return "Te han rodeado. Figuras encapuchadas emergen de las sombras proyectadas por los incendios. " +
               "'No pasarás de aquí, intruso. El Imperio reclama tu cabeza como trofeo'.";
    }
}