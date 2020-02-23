/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc_javafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author noteB00k
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblmsg;
    private Button btnclick;
    
    @FXML
    private void clickBotao(ActionEvent event) {
        System.out.println("voce cclicou arrombado");
        lblmsg.setText("OLa MUNDO DO DJANHo");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
