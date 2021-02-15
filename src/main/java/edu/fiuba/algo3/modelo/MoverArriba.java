package edu.fiuba.algo3.modelo;

public class MoverArriba implements Accion{

    public void aplicarAccion(Personaje personaje){
        personaje.moverArriba();
    }

    public void aplicarAccionInversa(Personaje personaje) { personaje.moverAbajo(); }

    public String devolverNombre(){
        return " Mover arriba";
    }
}
