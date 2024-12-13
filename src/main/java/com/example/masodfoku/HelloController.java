package com.example.masodfoku;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField num1;
    @FXML
    private TextField num3;
    @FXML
    private Label result2;
    @FXML
    private TextField num2;
    @FXML
    private Label result1;


    @FXML
    public void solveEquation(ActionEvent actionEvent) {
        try {
            System.out.println("hehe");
            if (!num1.getText().equals("") || !num3.getText().equals("") || !num2.getText().equals("")) {
                double a = Double.parseDouble(num1.getText());
                double b = Double.parseDouble(num2.getText());
                double c = Double.parseDouble(num3.getText());

                double sqrttemp = Math.sqrt(Math.pow(b, 2)-4*a*c);
                System.out.println("hehe2");

                if (sqrttemp < 0) {
                    result1.setText("Sqrt Error");
                } else {
                    double d = (-b + sqrttemp)/2*a;
                    double e = (-b - sqrttemp)/2*a;
                    System.out.println(Double.toString(d));
                    if (d == e) {
                        result1.setText("x = " + d);
                        result2.setText("");
                    } else {
                        System.out.println(d + " " + e);
                        result1.setText("x1 = " + d);
                        result2.setText("x2 = " + e);

                    }
                }
            }
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

}