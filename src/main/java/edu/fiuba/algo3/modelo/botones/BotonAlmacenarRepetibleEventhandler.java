package edu.fiuba.algo3.modelo.botones;

import edu.fiuba.algo3.interfaz.Consola;
import edu.fiuba.algo3.modelo.Juego;
import edu.fiuba.algo3.modelo.acciones.Accion;
import edu.fiuba.algo3.modelo.acciones.Repetible;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

public class BotonAlmacenarRepetibleEventhandler implements EventHandler<ActionEvent> {

    private Juego juego;
    private Consola consola;
    private Repetible repetible;

    public BotonAlmacenarRepetibleEventhandler(Juego juego, Consola consola, Repetible repetible){
        this.juego = juego;
        this.consola = consola;
        this.repetible = repetible;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        this.juego.agregarAccion(repetible);
        consola.display(repetible.devolverNombre());
    }
}