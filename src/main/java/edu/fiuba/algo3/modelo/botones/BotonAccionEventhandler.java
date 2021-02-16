package edu.fiuba.algo3.modelo.botones;

import edu.fiuba.algo3.interfaz.Consola;
import edu.fiuba.algo3.modelo.Juego;
import edu.fiuba.algo3.modelo.acciones.Accion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

public class BotonAccionEventhandler implements EventHandler<ActionEvent> {

    private Juego juego;
    private Accion accion;
    private Consola consola;

    public BotonAccionEventhandler(Juego juego, Accion accion, Consola consola){
        this.juego = juego;
        this.accion = accion;
        this.consola = consola;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        this.juego.agregarAccion(accion);
        consola.display(accion.devolverNombre());
    }
}