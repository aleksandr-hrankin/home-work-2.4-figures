import javax.swing.*;
import java.awt.*;

public class Painter extends JFrame {

    public Painter() {
        super("title");
        setLayout(new FlowLayout());

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 1000);

        setResizable(false);
        setLocationRelativeTo(null);

        setVisible(true);
    }
}
