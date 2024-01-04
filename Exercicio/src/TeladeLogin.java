import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeladeLogin extends JFrame {
    //Configuração do frame

    JLabel t1, t2;

    JButton b1;
    JMenuBar bar;
    JMenu menu;
    JMenuItem item1;
    JMenuItem item2;
    JTextField tf1;
    JPasswordField tf2;
    String nomeL = "Samuel";
    String senhaL = "123";
    public TeladeLogin(String nome,String senha)  {


        // Crioando menu
        bar = new JMenuBar();
        menu = new JMenu("Menu");
        item1 = new JMenuItem("Cadastro");
        item2 = new JMenuItem("Sair");
        bar.add(menu);
        setJMenuBar(bar);
        menu.add(item1);
        menu.add(item2);

        tf1 = new JTextField("");
        tf2 = new JPasswordField("");
        tf1.setBounds(100, 50, 150, 30); // Posição diferente para tf1
        tf2.setBounds(100, 100, 150, 30); // Posição diferente para tf2
        add(tf1);
        add(tf2);


        setTitle("Tela de Login");
        setLayout(null);
        setVisible(true);
        //setLayout(null);
        setSize(400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        t1 = new JLabel("titulo 1");
        t2 = new JLabel("titulo 2");
        b1 = new JButton("Sair");

        t1.setBounds(50,50,150,30);
        t2.setBounds(50,100,150,30);

        b1.setBounds(150,150,150,30);


        add(t1);
        add(t2);
        add(b1);

        ActionListener acaoAutenticar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                nomeL = tf1.getText();
                senhaL = tf2.getText();

                JOptionPane.showMessageDialog(null, "A" +nome + senha+ "B : "+nomeL + senhaL );

                if(nome.equals(nomeL) & senha.equals(senhaL)){
                    JOptionPane.showMessageDialog(null, "Login efetuado");
                    new TelaInicial();
                }
                else{
                    JOptionPane.showMessageDialog(null,"Senha incorreta");
                }
            }
        };b1.addActionListener(acaoAutenticar);



        ActionListener acaotrocar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new TeladeCadastro();

            }
        };item1.addActionListener(acaotrocar);

        ActionListener acaoSair = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };item2.addActionListener(acaoSair);



        //JOptionPane.showMessageDialog(null, nome + senha);



    }
    public TeladeLogin(){

    }
}
