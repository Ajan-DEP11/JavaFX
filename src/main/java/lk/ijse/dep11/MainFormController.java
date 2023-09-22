package lk.ijse.dep11;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class MainFormController {
    public AnchorPane root;
    public Button btnUp;
    public Button btnDown;
    public Button btnLeft;
    public Button btnRight;
    public javafx.scene.shape.Circle Circle;
    double x;
    double y;

    public void btnUpOnAction(ActionEvent actionEvent) {
        //System.out.println("Meka Wada yakoo");
        Circle.setCenterY(y -=20);
    }

    public void btnDownOnAction(ActionEvent actionEvent) {
        //System.out.println("Mekath Wada yakoo");
        Circle.setCenterY(y += 20);
    }

    public void btnLeftOnAction(ActionEvent actionEvent) {
        //System.out.println("Mekath Wada yakoo");
        Circle.setCenterX(x -= 20);
    }

    public void btnRightOnAction(ActionEvent actionEvent) {
        //System.out.println("Mekath Wada yakoo");
        Circle.setCenterX(x += 20);
    }
}
