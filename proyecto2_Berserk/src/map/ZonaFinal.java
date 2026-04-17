package map;

import enemies.EnemigoBasico;
import enemies.JefeFinal;
import enemies.JefeFinalFase2; // Importamos todas las clases de enemigos [cite: 1]

public class ZonaFinal extends Zona {

    public ZonaFinal() {
        super("El Dominio del Caballero de la Calavera");
    }

    @Override
    protected void inicializarEnemigos() {
        // Fase 1: Desgaste inicial
        getEnemigos().add(new EnemigoBasico("Horda de Muertos", "Innumerables esqueletos alzados.", 250, 30, 15));
        
        // Fase 2: El duelo contra el mito
        getEnemigos().add(new JefeFinal("Skull Knight", "El Caballero de la Causalidad.", 600, 60, 40));
        
        // Fase 3: El enfrentamiento final (Fase 2 de Skull Knight)
        getEnemigos().add(new JefeFinalFase2("Skull Knight Eterno", "Aquel que trasciende la muerte.", 900, 80, 55));
    }

    @Override
    public String getIntroduccion() {
        return "El tiempo parece detenerse. Te encuentras en una llanura infinita de espadas clavadas en el suelo, " +
               "bajo una luna de sangre que nunca se oculta. El destino te ha traído ante su guardián.";
    }

    @Override
    public String getDialogoIntermedio() {
        return "De la tierra removida, cientos de manos esqueléticas emergen. No tienen voluntad propia, " +
               "solo el mandato de probar si eres digno de enfrentarte al soberano de este reino.";
    }

    @Override
    public String getDialogoFinal() {
        return "El caballero sobre el corcel negro desenvaina su espada envuelta en espinas. Su voz suena como " +
               "mil tumbas abriéndose: 'Luchador contra el destino... para desafiar a la Mano de Dios, " +
               "primero debes demostrar que puedes vencer a la Muerte misma. ¡En guardia!'";
    }

    
    //Diálogo especial para el momento del renacimiento de Skull Knight.
     
    public String getDialogoFase2() {
        return "El Caballero se levanta de nuevo, su armadura emite un brillo espectral y los muertos " +
               "se reensamblan a su lado formando una guardia pretoriana. 'No está mal, forcejeador. " +
               "Pero la verdadera lucha contra la causalidad nunca es solitaria. ¡Siente el peso de la eternidad!'";
    }
}