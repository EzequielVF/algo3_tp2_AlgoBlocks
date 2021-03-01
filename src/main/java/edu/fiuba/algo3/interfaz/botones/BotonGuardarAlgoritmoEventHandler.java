package edu.fiuba.algo3.interfaz.botones;

import edu.fiuba.algo3.interfaz.Consola;
import edu.fiuba.algo3.modelo.Juego;
import edu.fiuba.algo3.modelo.excepciones.RepetibleNoTieneAccionesTodaviaExcepcion;
import edu.fiuba.algo3.modelo.excepciones.NombreNoValidoParaAlgoritmoExcepcion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class BotonGuardarAlgoritmoEventHandler implements EventHandler<ActionEvent> {
    private Juego juego;
    private Consola consola;
    private TextField nombreAlgoritmo;
    private MenuButton algoritmosGuardados;

    public BotonGuardarAlgoritmoEventHandler(Juego juego, Consola consola, TextField textField, MenuButton algoritmosGuardados){
        this.juego = juego;
        this.consola = consola;
        this.nombreAlgoritmo = textField;
        this.algoritmosGuardados = algoritmosGuardados;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        try{
            juego.crearAlgoritmoPersonalizado(nombreAlgoritmo.getText());
            MenuItem algoritmoPersonalizado = new MenuItem(nombreAlgoritmo.getText());
            BotonUsarAlgoritmoEventHandler botonUsardarHandler = new BotonUsarAlgoritmoEventHandler(juego, consola, nombreAlgoritmo.getText());
            algoritmoPersonalizado.setOnAction(botonUsardarHandler);
            this.reproducirSonido();
            algoritmosGuardados.getItems().add(algoritmoPersonalizado);
        }
        catch ( NombreNoValidoParaAlgoritmoExcepcion | RepetibleNoTieneAccionesTodaviaExcepcion e){
            consola.escribir(e.getMessage());
        }
    }
    private void reproducirSonido() {
        String musicFile = "src/main/resources/sonidobotonnormal.mp3";
        Media musica = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(musica);
        mediaPlayer.play();
    }
}
