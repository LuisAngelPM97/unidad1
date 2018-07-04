package Layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



import static java.awt.Color.ORANGE;

public class Practica002_VBox extends Application {

    public static void main(String[]args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button boton = new Button ("Click aqui");
        Label etiqueta = new Label ("Buen dia");
        Rectangle rectangulo = new Rectangle(100, 200, Color.ORANGE);

        VBox layout = new VBox();

        layout.setPadding(new Insets(100));

        layout.getChildren().add(boton);
        layout.getChildren().add(etiqueta);
        layout.getChildren().add(rectangulo);

        Scene escena = new Scene(layout);

        primaryStage.setScene(escena);
        primaryStage.show();

    }
}
