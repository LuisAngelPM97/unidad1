package Layout;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Practica011_TreeView extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        TreeItem<String> raiz, ram1, ram2;
        raiz = new TreeItem<>("Alimentos");
        raiz.setExpanded(true);

        ram1 = crearHijo("Vegetales", raiz);
        ram2 = crearHijo("carnes", raiz);

        crearHijo("Cebolla", ram1);
        crearHijo("Papa", ram1);

        crearHijo("Res", ram2);
        crearHijo("Pollo", ram2);


        TreeView treeView = new TreeView(raiz);
        treeView.setShowRoot(true);

        treeView.getSelectionModel().selectedItemProperty()
                .addListener(new ChangeListener() {
                    @Override
                    public void changed(ObservableValue observable, Object oldValue, Object newValue) {
                        System.out.println(newValue);
                    }
                });

        VBox layout = new VBox();
        layout.getChildren().add(treeView);

        Scene escena = new Scene(layout);
        primaryStage.setScene(escena);
        primaryStage.show();

    }

    private TreeItem<String> crearHijo(String titulo, TreeItem padre){
        TreeItem<String> hijo = new TreeItem<>(titulo);
        padre.getChildren().add(hijo);
        return hijo;
    }


}
