package figures;

import javax.swing.*;
import java.awt.*;

public abstract class Figure extends JPanel  {

    private final int x;
    private final int y;
    private final int scale;
    private final Color color;

    public Figure(int x, int y, int scale, Color color) {
        this.x = x;
        this.y = y;
        this.scale = scale;
        this.color = color;
    }

    public abstract double getArea();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getScale() {
        return scale;
    }

    public Color getColor() {
        return color;
    }
}
