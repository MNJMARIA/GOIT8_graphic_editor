package Shapes;

import interfaces.Borderable;

import java.awt.*;

public class Circle extends Shape implements Borderable {
    @Override
    public String getName()
    {
        return "Circle";
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
