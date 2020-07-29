import figures.*;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        int numberOfFigures = (int) (5 + Math.random() * 10);
        Figure[] figures = new Figure[numberOfFigures];

        Painter painter = new Painter();
        Information information;

        for (int i = 0; i < figures.length; i++) {
            figures[i] = getRandomFigure();
            painter.add(figures[i]);

            information = new Information(figures[i]);
            painter.add(information);

            System.out.println(figures[i].toString());
        }
    }

    private static Figure getRandomFigure() {
        int position = getRandomPosition();
        int size = getRandomSize();
        int color = getRandomColor();

        int randomValue = (int) (Math.random() * 4);

        switch (randomValue) {
            case 0:
                return new Square(position, position, size * 10, new Color(color));
            case 1:
                return new Trapezoid(position, position, size, new Color(color));
            case 2:
                return new Triangle(position, position, size, new Color(color));
        }
        return new Circle(position, position, size * 10, new Color(color));
    }

    private static int getRandomColor() {
        return (int) (Math.random() * 0x1000000);
    }

    private static int getRandomSize() {
        return (int) (1 + Math.random() * 5);
    }

    private static int getRandomPosition() {
        return (int) (1 + Math.random() * 1000);
    }
}
