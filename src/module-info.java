module javaFX1 {
	requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;
        
	opens application to javafx.graphics, javafx.fxml, javafx.controls;
}