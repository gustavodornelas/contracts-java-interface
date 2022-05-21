package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {
	
	@FXML
	private MenuItem menuItemDepartamento;
	
	@FXML
	private MenuItem menuItemVendedor;
		
	@FXML
	private MenuItem menuItemSobre;
	
	@FXML
	public void onMenuItemDepartamento() {
		System.out.println("onMenuItemDepartamento");
	}
	
	@FXML
	public void onMenuItemVendedor() {
		System.out.println("onMenuItemVendedor");
	}
	
	@FXML
	public void onMenuItemSobre() {
		System.out.println("onMenuItemSobre");
	}
	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}

}
