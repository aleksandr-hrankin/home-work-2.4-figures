package figures;

import java.awt.*;

public class Square extends Figure {

    private final int x;
    private final int y;
    private final int size;
    private final Color color;

    public Square(int x, int y, int size, Color color) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBounds(x, y, size + 1, size + 1);
        g.setColor(color);
        g.fillRect(0, 0, size, size);
    }

    @Override
    public int getScale() {
        return size;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return Math.pow(size, 2);
    }

    @Override
    public String toString() {
        return "Square: " +
                "S[" + getArea() + "]px " +
                "RGB[" + color.getRGB() + "]";
    }
}
