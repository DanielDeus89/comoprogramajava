package cap04.drawpanel;


import javax.swing.JPanel;
import java.awt.Graphics;

public class DrawPanel extends JPanel {
    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);

        int width = getWidth();   // Obtém a largura do painel
        int height = getHeight(); // Obtém a altura do painel

        System.out.println(width);
        System.out.println(height);

        graphics.drawLine(0, 0, width/2, height/2);
        graphics.drawLine(0, 0, width/3, height/3);
       // graphics.drawLine(0, height, width, 0);
    }
}

