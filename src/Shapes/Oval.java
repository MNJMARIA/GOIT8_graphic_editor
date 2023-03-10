package Shapes;

import interfaces.Borderable;

import java.awt.*;

public class Oval extends Shape implements Borderable {
    @Override
    public String getName()
    {
        return "Oval";
    }
    @Override
    public double getBorderWidth() {
        return 0;
    }

    @Override
    public double getBorderHeight() {
        return 0;
    }
}
