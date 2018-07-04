package Layout;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Practica008_EventoBoton extends Application {
    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        Label LabelValor1 = new Label("Valor 1");
        Label LabelValor2 = new Label("Valor 2");
        Label LabelResultado = new Label("Resultado");

        TextField TextFieldValor1 = new TextField();
        TextField TextFieldValor2 = new TextField();
        TextField TextFieldResultado = new TextField();

        Button botonSumar = new Button("Sumar");

        GridPane layout = new GridPane();

        layout.add(LabelValor1, 0, 0);
        layout.add(TextFieldValor1, 1, 0);

        layout.add(LabelValor2, 0, 1);
        layout.add(TextFieldValor2, 1, 1);

        layout.add(botonSumar, 0, 2, 2, 1);
        botonSumar.setAlignment(Pos.CENTER);

        botonSumar.setOnAction( e ->
        {
            int v1 = Integer.valueOf(TextFieldValor1.getText());
            int v2 = Integer.valueOf(TextFieldValor2.getText());

            int r = v1 + v2;
            TextFieldResultado.setText(String.valueOf(r));
        }
        );



        layout.add(LabelResultado, 0,3);
        layout.add(TextFieldResultado, 1, 3);
        Scene escena = new Scene(layout);
        primaryStage.setScene(escena);
        primaryStage.setTitle("¡¡Sumador!!");
        primaryStage.show();
    }
}
