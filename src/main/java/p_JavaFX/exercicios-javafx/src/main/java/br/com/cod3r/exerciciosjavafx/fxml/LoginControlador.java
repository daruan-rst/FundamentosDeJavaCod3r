package br.com.cod3r.exerciciosjavafx.fxml;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.controlsfx.control.Notifications;

public class LoginControlador {

    @FXML
    private TextField campoEmail;

    @FXML
    private PasswordField campoSenha;
    public void entrar() {
        boolean emailValido = campoEmail.equals("aluno@cod3r.com.br");
        boolean senhaValida = campoSenha.equals("12345678");

        if (senhaValida && emailValido) {
            Notifications.create()
                    .position(Pos.TOP_RIGHT)
                    .title("Login FXML")
                    .text("Login efetuado com sucesso!")
                    .showInformation();
        } else {
            Notifications.create()
                    .position(Pos.TOP_RIGHT)
                    .title("Login FXML")
                    .text("Usuario e senha inválidos")
                    .showError();
        }
    }
}
