package Pens;

import interfaces.Drawable;

import java.awt.*;

public class Pen implements Drawable {
    private String penName = "";
    public String getName()
    {
        return penName;
    }

    @Override
    public double getX() {
        return 0;
    }

    @Override
    public double getY() {
        return 0;
    }

}
