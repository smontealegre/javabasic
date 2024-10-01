import javax.swing.*;
import java.awt.*;

public class GraficoL extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibujar un gráfico de líneas simple
        g.setColor(Color.BLUE);
        g.drawLine(50, 50, 150, 150);
        g.drawLine(150, 150, 250, 100);
        g.drawLine(250, 100, 350, 200);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Gráfico Simple");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        GraficoL grafico = new GraficoL();
        frame.add(grafico);
        frame.setVisible(true);
    }
}
