package Layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.nio.file.attribute.PosixFilePermission;

public class CalculadoraBasica extends Application {

    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        TextField Resultado = new TextField("0");
        Button b1 = new Button("Limpiar todo");
        Button b2 = new Button("Limpiar");
        Button b3 = new Button("/");
        Button b4 = new Button("7");
        Button b5 = new Button("8");
        Button b6 = new Button("9");
        Button b7 = new Button("*");
        Button b8 = new Button("4");
        Button b9 = new Button("5");
        Button b10= new Button("6");
        Button b11= new Button("-");
        Button b12= new Button("1");
        Button b13= new Button("2");
        Button b14= new Button("3");
        Button b15= new Button("+");
        Button b16= new Button("0");
        Button b17= new Button(".");
        Button b18= new Button("=");

    GridPane layout = new GridPane();
    layout.setPadding(new Insets(10));
    layout.setVgap(10);
    layout.setHgap(10);


    layout.add(Resultado,1,0,4,1);
    layout.add(b1,1, 1,2,1);
    layout.add(b2,3,1);
    layout.add(b3,4,1);
    layout.add(b4,1,2);
    layout.add(b5,2,2);
    layout.add(b6,3,2);
    layout.add(b7,4,2);
    layout.add(b8,1,3);
    layout.add(b9,2,3);
    layout.add(b10,3,3);
    layout.add(b11,4,3);
    layout.add(b12,1,4);
    layout.add(b13,2,4);
    layout.add(b14,3,4);
    layout.add(b15,4,4);
    layout.add(b16,1,4,2,6);
    layout.add(b17,3,5);
    layout.add(b18,4,5);

    b1.setPrefSize(130,30);
    b2.setPrefSize(60,30);
    b3.setPrefSize(60,30);
    b4.setPrefSize(60,30);
    b5.setPrefSize(60,30);
    b6.setPrefSize(60,30);
    b7.setPrefSize(60,30);
    b8.setPrefSize(60,30);
    b9.setPrefSize(60,30);
    b10.setPrefSize(60,30);
    b11.setPrefSize(60,30);
    b12.setPrefSize(60,30);
    b13.setPrefSize(60,30);
    b14.setPrefSize(60,30);
    b15.setPrefSize(60,30);
    b16.setPrefSize(130,30);
    b17.setPrefSize(60,30);
    b18.setPrefSize(60,30);





    b4.setOnAction(e-> {
        if (Resultado.getText().equalsIgnoreCase("0")){
            Resultado.setText("7");
        } else {
            Resultado.setText(Resultado.getText() + "7");
        }
        Resultado.setAlignment(Pos.CENTER_RIGHT);
        Resultado.setEditable (false);
    });

        b5.setOnAction(e-> {
            if (Resultado.getText().equalsIgnoreCase("0")){
                Resultado.setText("8");
            } else {
                Resultado.setText(Resultado.getText() + "8");
            }
            Resultado.setAlignment(Pos.CENTER_RIGHT);
            Resultado.setEditable (false);
        });

        b6.setOnAction(e-> {
            if (Resultado.getText().equalsIgnoreCase("0")){
                Resultado.setText("9");
            } else {
                Resultado.setText(Resultado.getText() + "9");
            }
            Resultado.setAlignment(Pos.CENTER_RIGHT);
            Resultado.setEditable (false);
        });

        b8.setOnAction(e-> {
            if (Resultado.getText().equalsIgnoreCase("0")){
                Resultado.setText("4");
            } else {
                Resultado.setText(Resultado.getText() + "4");
            }
            Resultado.setAlignment(Pos.CENTER_RIGHT);
            Resultado.setEditable (false);
        });

        b9.setOnAction(e-> {
            if (Resultado.getText().equalsIgnoreCase("0")){
                Resultado.setText("5");
            } else {
                Resultado.setText(Resultado.getText() + "5");
            }
            Resultado.setAlignment(Pos.CENTER_RIGHT);
            Resultado.setEditable (false);
        });

        b10.setOnAction(e-> {
            if (Resultado.getText().equalsIgnoreCase("0")){
                Resultado.setText("6");
            } else {
                Resultado.setText(Resultado.getText() + "6");
            }
            Resultado.setAlignment(Pos.CENTER_RIGHT);
            Resultado.setEditable (false);
        });

        b12.setOnAction(e-> {
            if (Resultado.getText().equalsIgnoreCase("0")){
                Resultado.setText("1");
            } else {
                Resultado.setText(Resultado.getText() + "1");
            }
            Resultado.setAlignment(Pos.CENTER_RIGHT);
            Resultado.setEditable (false);
        });

        b13.setOnAction(e-> {
            if (Resultado.getText().equalsIgnoreCase("0")){
                Resultado.setText("2");
            } else {
                Resultado.setText(Resultado.getText() + "2");
            }
            Resultado.setAlignment(Pos.CENTER_RIGHT);
            Resultado.setEditable (false);
        });

        b14.setOnAction(e-> {
            if (Resultado.getText().equalsIgnoreCase("0")){
                Resultado.setText("3");
            } else {
                Resultado.setText(Resultado.getText() + "3");
            }
            Resultado.setAlignment(Pos.CENTER_RIGHT);
            Resultado.setEditable (false);
        });

        b16.setOnAction(e-> {
            if (Resultado.getText().equalsIgnoreCase("0")){
                Resultado.setText("0");
            } else {
                Resultado.setText(Resultado.getText() + "0");
            }
            Resultado.setAlignment(Pos.CENTER_RIGHT);
            Resultado.setEditable (false);
        });












        Scene escena = new Scene(layout);
        primaryStage.setScene(escena);
        primaryStage.show();
    }
}
