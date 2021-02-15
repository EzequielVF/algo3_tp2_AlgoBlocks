package edu.fiuba.algo3.modelo.acciones.repetibles;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.acciones.Repetible;
import edu.fiuba.algo3.modelo.acciones.Accion;

public class Algoritmo extends Repetible {

    public void aplicarAccion(Personaje personaje){
        for(Accion accion: accionesAEjecutar){
            accion.aplicarAccion(personaje);
        }
    }
    public void aplicarAccionInversa(Personaje personaje) {
        this.aplicarAccion(personaje);
    }

    public void transferirAcciones(Algoritmo aux){
        for(Accion accion: accionesAEjecutar){
            aux.almacenarAccion(accion);
        }
    }

    public String devolverNombre(){
        return " Algoritmo personalizado";
    }
}