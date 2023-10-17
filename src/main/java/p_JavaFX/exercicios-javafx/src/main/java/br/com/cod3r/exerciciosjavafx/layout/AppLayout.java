package br.com.cod3r.exerciciosjavafx.layout;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLayout extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent raiz = null;

//        raiz = new TesteAnchorPane();
//        raiz = new TesteBorderPane();
//        raiz = new TesteFlowPane();
//        raiz = new TesteGridPane();
//        raiz = new TesteStackPane();
        raiz = new TesteTilePane();

        Scene principal = new Scene(raiz, 800, 600);
        stage.setScene(principal);
        stage.setTitle("Gerenciadores de Layout");
        stage.show();


    }

    public static void main(String[] args) {

    }
}
