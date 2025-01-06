package cap02;

import javax.swing.*;

public class Addition {
    public static void main(String[] args) {

        var number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first integer:"));
        var number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second Number:"));

        var sum = number1 + number2;

        String message = String.format("Sum is: %s", sum);

        JOptionPane.showMessageDialog(null, message);
    }
}
