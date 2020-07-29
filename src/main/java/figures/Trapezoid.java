package figures;

import java.awt.*;

public class Trapezoid extends Figure {

    private final int x;
    private final int y;
    private final int size;
    private final Color color;

    public Trapezoid(int x, int y, int size, Color color) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
//        setBackground(Color.lightGray);
        setBounds(x, y, 92 * size, 61 * size);
        g.setColor(color);
        Polygon trapezoid = new Polygon();
        trapezoid.addPoint(1 * size, 60 * size);   //+
        trapezoid.addPoint(91 * size, 60 * size);
        trapezoid.addPoint(71 * size, 0 * size);  //+
        trapezoid.addPoint(21 * size, 0 * size);

        g.fillPolygon(trapezoid);
    }

    @Override
    public int getScale() {
        return 92 * size;
    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "Trapezoid: " +
                "S[Здесь_должна_быть_площадь,_но_я_хочу_спать] " +
                "RGB[" + color.getRGB() + "]";
    }
}
