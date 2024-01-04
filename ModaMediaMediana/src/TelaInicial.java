import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInicial extends JFrame {

    private JTextField textField;
    private JButton addButton;
    private JTextArea resultArea;
    private int[] numeros;

    public TelaInicial() {
        // Configurações básicas da janela
        setTitle("Adicionar Números");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Componentes da interface
        textField = new JTextField(10);
        addButton = new JButton("Adicionar");
        resultArea = new JTextArea(8, 20);
        resultArea.setEditable(false);

        // Adiciona os componentes à janela
        add(textField);
        add(addButton);
        add(resultArea);

        // Configuração do botão
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarNumero();
            }
        });
    }

    private void adicionarNumero() {
        // Obtém o texto do campo de texto
        String textoNumero = textField.getText();

        try {
            // Converte o texto para um número inteiro
            int numero = Integer.parseInt(textoNumero);

            // Adiciona o número ao array
            if (numeros == null) {
                numeros = new int[]{numero};
            } else {
                int[] novoArray = new int[numeros.length + 1];
                System.arraycopy(numeros, 0, novoArray, 0, numeros.length);
                novoArray[numeros.length] = numero;
                numeros = novoArray;
            }

            // Atualiza a área de resultados
            atualizarResultados();

            // Limpa o campo de texto
            textField.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void atualizarResultados() {
        // Atualiza a área de resultados com os números no array
        StringBuilder sb = new StringBuilder("Números Adicionados:\n");
        if (numeros != null) {
            for (int numero : numeros) {
                sb.append(numero).append("\n");
            }
        }
        resultArea.setText(sb.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NumerosArrayGUI().setVisible(true);
            }
        });
    }
}
