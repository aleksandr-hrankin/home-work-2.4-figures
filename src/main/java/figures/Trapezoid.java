package figures;

import java.awt.*;

public class Trapezoid extends Figure {

    public Trapezoid(int x, int y, int scale, Color color) {
        super(x, y, scale, color, "трапеция");
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBounds(getX(), getY(), 92 * getScale(), 61 * getScale());
        g.setColor(getColor());
        Polygon trapezoid = new Polygon();
        trapezoid.addPoint(1 * getScale(), 60 * getScale());   //+
        trapezoid.addPoint(91 * getScale(), 60 * getScale());
        trapezoid.addPoint(71 * getScale(), 0 * getScale());  //+
        trapezoid.addPoint(21 * getScale(), 0 * getScale());

        g.fillPolygon(trapezoid);
    }

    @Override
    public double getArea() {
        return 0;
    }
}
