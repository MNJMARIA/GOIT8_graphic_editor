package Shapes;

import interfaces.ScalableDrawer;

import java.awt.*;

public class Shape implements ScalableDrawer {
    private String shapeName = "";
    public String getName()
    {
        return shapeName;
    }

    @Override
    public double getX() {
        return 0;
    }

    @Override
    public double getY() {
        return 0;
    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public double getScale() {
        return 0;
    }
}
