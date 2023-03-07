package Shapes;

import interfaces.Borderable;

import java.awt.*;

public class Phombus extends Shape implements Borderable {
    @Override
    public String getName()
    {
        return "Phombus";
    }
    @Override
    public double getBorderWidth() {
        return 0;
    }

    @Override
    public double getBorderHeight() {
        return 0;
    }

    @Override
    public Color getBorderColor() {
        return null;
    }
}
