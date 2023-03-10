package Shapes;

import interfaces.Borderable;

import java.awt.*;

public class Triangle extends Shape implements Borderable {
    @Override
    public String getName()
    {
        return "Triangle";
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
