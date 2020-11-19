package Operaciones;

import javax.swing.*;

public class main {

    public static void main(String[] args) {
        Calcular calcular = new Calcular();

        calcular.setTitle("Calculadora Basica by RichardS");
        calcular.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calcular.pack();
        calcular.setVisible(true);
    }
}
