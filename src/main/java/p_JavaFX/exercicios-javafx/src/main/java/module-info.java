module br.com.cod3r.exerciciosjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens basico;
    opens layout;
    opens fxml;
//    opens br.com.cod3r.exerciciosjavafx.basico to javafx.fxml;
//    exports br.com.cod3r.exerciciosjavafx.basico;
}