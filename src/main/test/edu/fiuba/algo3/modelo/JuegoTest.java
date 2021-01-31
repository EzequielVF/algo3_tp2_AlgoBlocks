package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JuegoTest {
    @Test
    public void PruebaMoverALaderecha() {
        Juego juego = new Juego();
        Posicion posicion_aux = new Posicion();
        assertEquals(posicion_aux,juego.devolverPosicionActualPersonaje());
        juego.agregarAccion(new MoverALaDerecha());
        juego.ejecutar();
        posicion_aux.sumarAColumna();
        assertEquals(posicion_aux, juego.devolverPosicionActualPersonaje());
    }
    @Test
    public void PruebaMoverALaIzquierda() {
        Juego juego = new Juego();
        assertEquals(13,juego.devolverPosicionActualPersonaje());
        juego.agregarAccion(new MoverALaIzquierda());
        juego.ejecutar();
        assertEquals(12, juego.devolverPosicionActualPersonaje());
    }
    @Test
    public void PruebaMoverArriba() {
        Juego juego = new Juego();
        assertEquals(13,juego.devolverPosicionActualPersonaje());
        juego.agregarAccion(new MoverArriba());
        juego.ejecutar();
        assertEquals(8, juego.devolverPosicionActualPersonaje());
    }
    @Test
    public void PruebaMoverAbajo() {
        Juego juego = new Juego();
        assertEquals(13,juego.devolverPosicionActualPersonaje());
        juego.agregarAccion(new MoverAbajo());
        juego.ejecutar();
        assertEquals(18, juego.devolverPosicionActualPersonaje());
    }
    @Test
    public void PruebaEstadoInicialPincelArriba() {
        Juego juego = new Juego();
        EstadoPincel aux = new PincelArriba();
        assertEquals(aux.getClass(),(juego.devolverEstadoPincel().getClass()));
    }
    @Test
    public void PruebaBajarPincel() {
        Juego juego = new Juego();
        EstadoPincel aux = new PincelAbajo();
        juego.agregarAccion(new BajarPincel());
        juego.ejecutar();
        assertEquals(aux.getClass(),(juego.devolverEstadoPincel().getClass()));
    }
    @Test
    public void PruebaBajarYSubirPincel() {
        Juego juego = new Juego();
        EstadoPincel aux = new PincelArriba();
        juego.agregarAccion(new BajarPincel());
        juego.agregarAccion(new SubirPincel());
        juego.ejecutar();
        assertEquals(aux.getClass(),(juego.devolverEstadoPincel().getClass()));
    }/*
    @Test
    public void PruebaCantidadDeCeldasPintadasCorrecta() {
        Juego juego = new Juego();
        juego.agregarAccion(new BajarPincel());
        juego.agregarAccion(new MoverALaDerecha());
        juego.agregarAccion(new MoverALaDerecha());
        juego.ejecutar();
        assertEquals(3,(juego.devolverCeldasPintadas()));
    }*/

    @Test
    public void PruebaRepetirPorDos() {
        Juego juego = new Juego();
        RepetirPorDos repetirPorDos = new RepetirPorDos();
        repetirPorDos.almacenarAccion(new MoverALaDerecha());
        juego.agregarAccion(repetirPorDos);
        juego.ejecutar();
        assertEquals(15, juego.devolverPosicionActualPersonaje());
    }
}
