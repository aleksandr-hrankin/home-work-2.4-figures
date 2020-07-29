package figures;

import java.awt.*;
import java.text.DecimalFormat;

public class Circle extends Figure {

    public Circle(int x, int y, int scale, Color color) {
        super(x, y, scale, color, "Круг");
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBounds(getX(), getY(), getScale() + 1, getScale() + 1);
        g.setColor(getColor());
        g.fillOval(0, 0, getScale(), getScale());
    }

    @Override
    public double getArea() {
        return Math.PI / 4 * Math.pow(getScale(), 2);
    }

    public double getCircumference() {
        return Math.PI * getScale();
    }
}
