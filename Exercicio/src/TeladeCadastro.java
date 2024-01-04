import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeladeCadastro extends JFrame{

    JLabel t1,t2;
    JButton b1;
    JMenuBar bar;
    JMenu menu;
    JMenuItem item1,item2;

    JTextField tf1;
    JPasswordField tf2;

    String nome;
    String senha;



    public TeladeCadastro() {
        setTitle("Tela de Cadastro");
        // Crioando menu
        bar = new JMenuBar();
        menu = new JMenu("Menu");
        item1 = new JMenuItem("Login");
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

        //Configuração do frame
        setLayout(null);
        setVisible(true);
        setSize(400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        //titulos
        t1 = new JLabel("Titulo 1");
        t2 = new JLabel("Titulo 2");

        t1.setBounds(50,50,150,30);
        t2.setBounds(50,100,150,30);

        add(t1);
        add(t2);

        b1 = new JButton("Sair1");
        b1.setBounds(150,150,150,30);
        add(b1);



        ActionListener acaoCad = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
               // new TeladeLogin();
                nome = tf1.getText();
                senha = tf2.getText();
                JOptionPane.showMessageDialog(null, nome + senha);
                new TeladeLogin(nome,senha);


            }
        };b1.addActionListener(acaoCad);

        ActionListener acaotrocar = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);

                new TeladeLogin();
            }
        };item1.addActionListener(acaotrocar);


        ActionListener acaosair = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };item2.addActionListener(acaosair);
    }


    public static void main(String args[]){
      System.out.println("Ola mundo");
      new TeladeCadastro();
      new TeladeLogin();
     // new TelaInicial();
  }
}