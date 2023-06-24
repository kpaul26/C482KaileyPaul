package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ModifyPartController implements Initializable {
    Stage stage;
    Parent scene;
    @FXML
    private RadioButton inHouseRBtn;

    @FXML
    private ToggleGroup modifyPart;

    @FXML
    private RadioButton outSourcedRBtn;

    @FXML
    private TextField partIdTxt;

    @FXML
    private TextField partInvTxt;

    @FXML
    private TextField partMachineTxt;

    @FXML
    private TextField partMaxTxt;

    @FXML
    private TextField partMinTxt;

    @FXML
    private TextField partNameTxt;

    @FXML
    private TextField partPriceTxt;

    @FXML
    void onActionCancelModifiedPart(ActionEvent event)throws IOException {
        stage = (Stage) ((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/view/MainScreen.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
    }

    @FXML
    void onActionSaveModifiedPart(ActionEvent event) {
        int stock = Integer.parseInt(partInvTxt.getText());
        int id = Integer.parseInt(partIdTxt.getId());
        String name = partNameTxt.getText();
        double price = Double.parseDouble(partPriceTxt.getText());
        int min = Integer.parseInt(partMinTxt.getText());
        int max = Integer.parseInt(partMaxTxt.getText());
    }

    @Override
    public void initialize (URL url, ResourceBundle rb){
        //todo
    }
}