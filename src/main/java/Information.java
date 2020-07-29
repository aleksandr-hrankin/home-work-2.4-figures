import figures.Figure;

import javax.swing.*;
import java.awt.*;

public class Information extends JPanel {

    private final int WIDTH_PANEL = 600;
    private final int HEIGHT_PANEL = 80;

    private final int TEXT_SIZE = 20;

    private final int TEXT_POSITION_Y = 15;

    private final Figure figure;

    public Information(Figure figure) {
        this.figure = figure;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBounds(figure.getX(), figure.getY(), WIDTH_PANEL, HEIGHT_PANEL);
        g.setFont(new Font("Serif", Font.ITALIC, TEXT_SIZE));
        g.setColor(Color.BLACK);
        String[] messages = figure.toString().split(" ");
        int lineJump = TEXT_POSITION_Y;
        for (String s : messages) {
            g.drawString(s, figure.getScale(),  lineJump);
            lineJump = lineJump + 15;
        }
    }
}
