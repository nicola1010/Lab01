package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	
	Parole elenco ;
	

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;
    
    @FXML
    private TextArea txtTempo;

    @FXML
    private Button btnReset;
    
    @FXML
    private Button btnCancella;

    @FXML
    void doInsert(ActionEvent event) {
    	double b= System.nanoTime();
    	String p= txtParola.getText();
    	elenco.addParola(p);
    	this.txtParola.clear();
    	this.txtResult.clear();
    	for(String j: elenco.getElenco()) {  		
    		this.txtResult.appendText(j+"\n");
    	}
    	
    	double f= System.nanoTime();
    	double r=f-b;
    	String res=Double.toString(r);
    	this.txtTempo.clear();
    	txtTempo.appendText(res);
    }

    @FXML
    void doReset(ActionEvent event) {
    	double b= System.nanoTime();
    	elenco.reset();
    	this.txtResult.clear();
    	double f= System.nanoTime();
    	double r=f-b;
    	String res=Double.toString(r);
    	this.txtTempo.clear();
    	txtTempo.appendText(res);
    }
    
    @FXML
    void doCancella(ActionEvent event) {
    	double b= System.nanoTime();
    	String h=this.txtResult.getSelectedText();
    	elenco.remove(h);
    	this.txtParola.clear();
    	this.txtResult.clear();
    	for(String j: elenco.getElenco()) {  		
    		this.txtResult.appendText(j+"\n");
    		}
    		double f= System.nanoTime();
        	double r=f-b;
        	String res=Double.toString(r);
        	this.txtTempo.clear();
        	txtTempo.appendText(res);
    	
    	
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtTempo != null : "fx:id=\"txtTempo\" was not injected: check your FXML file 'Untitled'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Untitled'.";
        
        
        elenco = new Parole() ;
    }
}
