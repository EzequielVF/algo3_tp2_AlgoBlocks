package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PincelTest {
    @Test
    public void PincelSeIniciaConEstadoPincelArriba() {
        Pincel pincel = new Pincel();
        EstadoPincel aux = new PincelArriba();
        assertEquals(aux.getClass(),(pincel.devolverEstadoPincel().getClass()));
    }
    @Test
    public void PincelActualizoSuEstado() {
        Pincel pincel = new Pincel();
        EstadoPincel aux = new PincelAbajo();
        pincel.bajarPincel();
        assertEquals(aux.getClass(),(pincel.devolverEstadoPincel().getClass()));
    }
    @Test
    public void PincelAbajoPintaCelda() {
        Pincel pincel = new Pincel();
        Celda celda = new Celda();
        EstadoPincel aux = new PincelAbajo();
        pincel.bajarPincel();
        assertEquals(aux.getClass(),(pincel.devolverEstadoPincel().getClass()));
        pincel.usarSobre(celda);
        assertEquals(true,celda.devolverEstado());
    }
    @Test
    public void PincelArribaNoPintaCelda() {
        Pincel pincel = new Pincel();
        Celda celda = new Celda();
        EstadoPincel aux = new PincelArriba();
        assertEquals(aux.getClass(),(pincel.devolverEstadoPincel().getClass()));
        pincel.usarSobre(celda);
        assertEquals(false,celda.devolverEstado());
    }
}
