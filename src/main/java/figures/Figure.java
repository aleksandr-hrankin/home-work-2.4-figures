package figures;

import javax.swing.*;
import java.awt.*;

public abstract class Figure extends JPanel  {

    private final int x;
    private final int y;
    private final int scale;
    private final Color color;
    private final String name;

    public Figure(int x, int y, int scale, Color color, String name) {
        this.x = x;
        this.y = y;
        this.scale = scale;
        this.color = color;
        this.name = name;
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

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Фигура: " + getName() + ", площадь: " + getArea() + " кв. ед., длина стороны: 5 ед., цвет: " + getColor();
    }
}
