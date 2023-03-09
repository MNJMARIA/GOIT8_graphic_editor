import Pens.*;
import Shapes.*;

public class Main {
    public static void main(String[] args)
    {
        //printers
        ShapePrinter shapePrinter = new ShapePrinter();
        PenPrinter penPrinter = new PenPrinter();

        //print name of shape
        shapePrinter.printShape(new Triangle());
        shapePrinter.printShape(new Circle());
        shapePrinter.printShape(new Oval());
        shapePrinter.printShape(new Quad());
        shapePrinter.printShape(new Phombus());
        //print name of pen
        penPrinter.printPen(new Highlighter());
        penPrinter.printPen(new Eraser());
        penPrinter.printPen(new Pencil());
    }
}