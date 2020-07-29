package figures;

import java.awt.*;

public class Square extends Figure {

    public Square(int x, int y, int scale, Color color) {
        super(x, y, scale, color);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBounds(getX(), getY(), getScale() + 1, getScale() + 1);
        g.setColor(getColor());
        g.fillRect(0, 0, getScale(), getScale());
    }

    @Override
    public double getArea() {
        return Math.pow(getScale(), 2);
    }

    @Override
    public String toString() {
        return "Square: " +
                "S[" + getArea() + "]px " +
                "RGB[" + getColor().getRGB() + "]";
    }
}
