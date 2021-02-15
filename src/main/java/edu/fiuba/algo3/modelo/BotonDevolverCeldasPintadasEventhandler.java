package edu.fiuba.algo3.modelo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonDevolverCeldasPintadasEventhandler implements EventHandler<ActionEvent> {

    private Juego juego;


    public BotonDevolverCeldasPintadasEventhandler(Juego juego){
        this.juego = juego;
    }

    @Override
    public void handle(ActionEvent actionEvent){

        System.out.println(this.juego.devolverCeldasPintadas());
    }
}