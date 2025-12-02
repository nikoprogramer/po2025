package org.example.samochodgui;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import symulator.*;

import java.sql.SQLOutput;

public class SamochodController {


    public Button startButton;
    public void onStartButton(){
        symulator.Samochod.wlacz();
    }

    public Button stopButton;
    public void onStopButton(){
        symulator.Samochod.wylacz();
    }
    public TextField carmodelTextField;
    public TextField carregistrationTextField;
    public TextField carweightTextField;
    public TextField carspeedTextField;
    public TextField gearboxnameTextField;
    public TextField gearboxpriceTextField;
    public TextField gearboxweightTextField;
    public TextField gearboxgearTextField;
    public Button shiftupButton;
    public void onShiftupButton(){
        symulator.SkrzyniaBiegow.zwiekszBieg();
    }
    public Button shiftdownButton;
    public void onShiftdownButton(){
        symulator.SkrzyniaBiegow.zmniejszBieg();
    }
    public TextField enginenameTextField;
    public TextField enginepriceTextField;
    public TextField engineweightTextField;
    public TextField enginerpmTextField;
    public Button accelerateButton;
    public Button deaccelerateButton;
    public TextField clutchnameTextField;
    public TextField clutchpriceTextField;
    public TextField clutchweightTextField;
    public TextField clutchstateTextField;
    public Button clutchengButton;
    public Button clutchdngButton;
    public ComboBox carComboBox;
    public void onCarComboBoxButton(){

    }
    public Button addcarButton;
    public Button rmcarButton;
}
