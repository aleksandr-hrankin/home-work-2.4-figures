package figures;

import java.awt.*;

public class Triangle extends Figure {

    public Triangle(int x, int y, int scale, Color color) {
        super(x, y, scale, color, "Треугольник");
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBounds(getX(), getY(), 22 * getScale(), 40 * getScale());
        g.setColor(getColor());
        Polygon triangle = new Polygon();
        triangle.addPoint(1 * getScale(), 40 * getScale());
        triangle.addPoint(22 * getScale(), 40 * getScale());
        triangle.addPoint(11 * getScale(), 20);
        g.fillPolygon(triangle);
    }

    @Override
    public double getArea() {
        return 0;
    }
}
