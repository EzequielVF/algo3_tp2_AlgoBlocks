package edu.fiuba.algo3.modelo;

public class Celda {

    public boolean pintada = false;

    public void pintar(){
        pintada = true;
    }
    public boolean devolverEstado(){
        return pintada;
    }
}

