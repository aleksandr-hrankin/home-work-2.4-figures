package figures;

import javax.swing.*;
import java.awt.*;

public abstract class Figure extends JPanel  {

    public abstract double getArea();
    public abstract Color getColor();
    public abstract int getScale();
}
