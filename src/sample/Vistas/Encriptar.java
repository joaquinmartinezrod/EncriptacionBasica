package sample.Vistas;

import com.sun.corba.se.pept.transport.Acceptor;
import com.sun.corba.se.pept.transport.Connection;
import com.sun.corba.se.pept.transport.EventHandler;
import com.sun.corba.se.spi.orbutil.threadpool.Work;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import sample.Algoritmos.Encriptacion;

import java.awt.*;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;

public class Encriptar extends Stage  {
    private VBox vBox;
    private HBox hBox1;
    private HBox hBox2;
    private javafx.scene.control.TextArea textAreaEncriptar;
    private javafx.scene.control.TextArea textAreaDesencripta;
    private javafx.scene.control.Button btnEncriptar;
    private javafx.scene.control.Button btnDesencriptar;
    private javafx.scene.control.Label lblEncriptar;
    private javafx.scene.control.Label lblDesencriptar;
    private String cadena;
    private Scene scene;
    private HBox hBox3;

    public Encriptar() {
        BuildGUI();
    }

    public void BuildGUI() {
        vBox = new VBox();
        hBox1 = new HBox();
        hBox2 = new HBox();
        hBox3 = new HBox();
        textAreaDesencripta = new javafx.scene.control.TextArea();
        textAreaEncriptar = new TextArea();
        lblDesencriptar = new javafx.scene.control.Label("Desencriptado");
        lblEncriptar = new javafx.scene.control.Label("Encriptado");

        btnDesencriptar = new javafx.scene.control.Button("DESENCRIPTAR");
        btnEncriptar = new javafx.scene.control.Button("ENCRIPTAR");

        hBox1.getChildren().addAll(lblEncriptar,lblDesencriptar);
        hBox1.setSpacing(50);
        hBox2.getChildren().addAll(textAreaEncriptar,textAreaDesencripta);
        hBox3.getChildren().addAll(btnEncriptar,btnDesencriptar);
        hBox3.setSpacing(50);

        vBox.getChildren().addAll(hBox1,hBox2,hBox3);


        btnEncriptar.setOnAction(event -> Encriptar(textAreaEncriptar.getText()));
        btnDesencriptar.setOnAction(event -> Desencriptar(textAreaDesencripta.getText()));

        scene = new Scene(vBox,400,600);
        this.setScene(scene);
        this.setResizable(false);
        this.setTitle("Encriptar & Desencriptar");
        this.show();


    }

    public void Encriptar(String cadena){
        Encriptacion encriptacion = new Encriptacion();
        encriptacion.setCadena(cadena);
        encriptacion.setEncriptado();
        encriptacion.encriptar();
        cadena = encriptacion.getEncriptado();
        textAreaDesencripta.setText(cadena);
        System.out.println(cadena);

    }
    public void Desencriptar(String cadena){
        Encriptacion encriptacion = new Encriptacion();
        encriptacion.setCadena(cadena);
        encriptacion.desencriptar();
        encriptacion.desencriptar();
        cadena = encriptacion.getDesencriptado();
        textAreaDesencripta.setText(cadena);
        System.out.println(cadena);
    }
}
