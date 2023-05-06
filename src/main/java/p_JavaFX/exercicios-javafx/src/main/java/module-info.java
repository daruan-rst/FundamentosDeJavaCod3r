module br.com.cod3r.exerciciosjavafx {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens br.com.cod3r.exerciciosjavafx to javafx.fxml;
    exports br.com.cod3r.exerciciosjavafx;
}