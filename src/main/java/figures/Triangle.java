package figures;

import java.awt.*;

public class Triangle extends Figure {

    private final int x;
    private final int y;
    private final int size;
    private final Color color;

    public Triangle(int x, int y, int size, Color color) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBounds(x, y, 22 * size, 40 * size);
        g.setColor(color);
        Polygon triangle = new Polygon();
        triangle.addPoint(1 * size, 40 * size);
        triangle.addPoint(22 * size, 40 * size);
        triangle.addPoint(11 * size, 20);
        g.fillPolygon(triangle);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int getScale() {
        return 22 * size;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "Triangle: " +
                "S[Здесь_должна_быть_площадь,_но_я_хочу_спать] " +
                "RGB[" + color.getRGB() + "]";
    }
}
