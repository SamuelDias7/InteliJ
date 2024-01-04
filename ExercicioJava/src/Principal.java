import javax.swing.*;
import java.awt.*;

public class Principal extends JPanel {

    public Principal(){

    }

    public static void main(String args[]){

        public static void a(){
            JFrame frame = new JFrame("Tela");
            Principal painel = new Principal();
            frame.add(painel);
            frame.setVisible(true);
            frame.setSize(400,400);
            frame.setLocationRelativeTo(null);
        }


    }
}
