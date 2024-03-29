package br.com.cod3r.exerciciosjavafx.basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {

    private int contador = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Label labelTitulo = new Label("Contador");
        labelTitulo.getStyleClass().add("titulo");

        Label labelNumero  = new Label("0");
        labelNumero.getStyleClass().add("numero");

        Button botaoIncremento = new Button("+");
        botaoIncremento.getStyleClass().add("botoes");
        botaoIncremento.setOnAction(e -> {
            contador++;
            determineLabelNumeroColor(labelNumero);
        });
        Button botaoDecremento = new Button("-");
        botaoDecremento.getStyleClass().add("botoes");
        botaoDecremento.setOnAction(e -> {
            contador--;
            labelNumero.setText(Integer.toString(contador));
            determineLabelNumeroColor(labelNumero);
        });


        HBox boxBotoes = new HBox();
        boxBotoes.setAlignment(Pos.CENTER);
        boxBotoes.setSpacing(10);
        boxBotoes.getChildren().add(botaoIncremento);
        boxBotoes.getChildren().add(botaoDecremento);

        VBox boxConteudo = new VBox();
        boxConteudo.getStyleClass().add("conteudo");
        boxConteudo.setAlignment(Pos.CENTER);
        boxBotoes.setSpacing(10);
        boxConteudo.getChildren().add(labelTitulo);
        boxConteudo.getChildren().add(labelNumero);
        boxConteudo.getChildren().add(boxBotoes);

        String caminhoDoCss = getClass()
                .getResource("/basico/Contador.css").toExternalForm();
        Scene cenaPrincipal = new Scene(boxConteudo, 400, 400);
        cenaPrincipal.getStylesheets().add(caminhoDoCss);
        cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css?family=Oswald");

        primaryStage.setScene(cenaPrincipal);
        primaryStage.show();

    }

    private void determineLabelNumeroColor(Label labelNumero){
        labelNumero.setText(Integer.toString(contador));
        labelNumero.getStyleClass().remove("verde");
        labelNumero.getStyleClass().remove("vermelha");

        String color = contador > 0 ? "verde" : "vermelha";

        labelNumero.getStyleClass().add(color);

    }

    public static void main(String[] args) {
        launch(args);
    }
}
