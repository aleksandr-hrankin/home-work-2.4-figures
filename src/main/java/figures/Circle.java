package figures;

import java.awt.*;
import java.text.DecimalFormat;

public class Circle extends Figure {

    private final int x;
    private final int y;
    private final int size;
    private final Color color;

    public Circle(int x, int y, int size, Color color) {
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
        g.fillOval(0, 0, size, size);
    }

    public int getScale() {
        return size;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return Math.PI / 4 * Math.pow(size, 2);
    }

    public double getCircumference() {
        return Math.PI * size;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        return "Circle: " +
                "S[" + decimalFormat.format(getArea()) + "px] " +
                "RGB[" + color.getRGB() + "] " +
                "Circumference[" + decimalFormat.format(getCircumference()) + "px]";
    }
}
