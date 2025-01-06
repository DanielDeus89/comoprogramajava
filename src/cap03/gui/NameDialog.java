package cap03.gui;

import javax.swing.*;

public class NameDialog {
    public static void main(String[] args) {
        var name = JOptionPane.showInputDialog("What's your name:");

        String message = String.format("Welcome %s, to Java Programing", name);

        JOptionPane.showMessageDialog(null, message);
    }
}
