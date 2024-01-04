import javax.swing.*;
import java.awt.*;

public class TelaInicial extends JFrame {
    ImageIcon imagem = new ImageIcon(TelaInicial.class.getResource("orochicabelo.jpeg"));
    JLabel label = new JLabel(imagem);

    public TelaInicial() {
        setLayout(new BorderLayout());
        add(label, BorderLayout.CENTER);
        setSize(800,800);
        setLocationRelativeTo(null);
        setVisible(true);



    }

}
