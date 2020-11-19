package Operaciones;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calcular extends JFrame {
    private JTextField text_n1;
    private JRadioButton rb_suma;
    private JRadioButton rb_resta;
    private JRadioButton rb_multi;
    private JRadioButton rb_division;
    private JTextField txtx_resultado;
    private JTextField text_n2;
    private JButton button1;
    private JPanel contentPane;

    public Calcular() {
        add(contentPane);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1, n2, resultado = 0;
                n1 = Integer.parseInt(text_n1.getText());
                n2 = Integer.parseInt(text_n2.getText());

                if (rb_suma.isSelected()) {
                    resultado = n1 + n2;
                } else if (rb_resta.isSelected()) {
                    resultado = n1 - n2;
                } else if (rb_multi.isSelected()) {
                    resultado = n1 * n2;
                } else if (rb_division.isSelected()) {
                    resultado = n2 / n2;
                } else {
                    JOptionPane.showMessageDialog(null, "Selecciona una de las operaciónes");
                }

                txtx_resultado.setText("" + resultado);
            }
        });
    }

}
